package request;

import java.util.ArrayList;

import App.Client;
import common.Operation;
import entities.Message;
import entities.Worker;
import gui.EmployeeLoginController;
import javafx.event.ActionEvent;

public class Login {

	private static ActionEvent event;

	public static void requestLogin(String username, String password, ActionEvent BtnEvent) {
		ArrayList<String> login = new ArrayList<String>();
		login.add(username);
		login.add(password);
		event = BtnEvent;
		Message sendMessage = new Message(Operation.Login, login);
		Client.chat.accept(sendMessage);
	}

	public static void resiveLogin(Object msg) {
		System.out.println("--> resiveLogin ");
		Message resivedMessage = (Message) msg;
		Worker worker = (Worker) resivedMessage.getObj();
		switch (resivedMessage.getPermesion()) {
		case yes:
			EmployeeLoginController.EmployeeLoginController.setLogin(worker, event);
			break;
		case no:
			EmployeeLoginController.EmployeeLoginController.setError("Wrong User Name or Password");
			break;
		case NULL:
			EmployeeLoginController.EmployeeLoginController.setError("The user does not exist");
			break;

		default:
			break;
		}

	}

}
