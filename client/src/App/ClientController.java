package App;

import java.io.IOException;

import entities.Message;


public class ClientController {
	ChatClient client;

	public ClientController(String host, int port) {
		try {
			client = new ChatClient(host, port);
		} catch (IOException e) {

			e.printStackTrace();
			 System.out.println("Error: Can't setup connection!"+ " Terminating client.");
		      System.exit(1);
		}
	}

	public void accept(Message message) {
		client.handleMessageFromClient(message);
	}
}
