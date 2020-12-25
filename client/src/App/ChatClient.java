package App;

import java.io.IOException;
import gui.EmployeeLoginController;
import entities.Message;
import ocsf.client.AbstractClient;
import request.Login;

public class ChatClient extends AbstractClient {

	public static EmployeeLoginController EmployeeLoginController;
	public static boolean awaitResponse = false;

	public ChatClient(String host, int port) throws IOException {
		super(host, port);
	}

	public void handleMessageFromServer(Object msg) {

		Message resivedMessage = (Message) msg;
		awaitResponse = false;
		switch (resivedMessage.getOperationType()) {
		case Login:
			Login.resiveLogin(msg);
			break;

		default:
			System.out.println("--> client --> handleMessageFromServer --> no operation.");
			break;
		}

	}

	public void handleMessageFromClient(Message message) {
		try {
			openConnection();
			awaitResponse = true;
			sendToServer(message);
			while (awaitResponse) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			closeConnection();
		} catch (IOException e) {
			System.out.println("--> client --> handleMessageFromClient --> not send.");
			e.printStackTrace();
			quit();
		}

	}

	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}

}
