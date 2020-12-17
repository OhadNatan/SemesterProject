package client;

import javafx.application.Application;

import javafx.stage.Stage;

import gui.ClientFrameController;

public class ClientUI extends Application {
	public static ClientController chat; // only one instance

	public static void main(String args[]) throws Exception {
		launch(args);
	} // end main

	@Override
	public void start(Stage primaryStage) throws Exception {
		chat = new ClientController("localhost", 5555);
		
		ClientFrameController aFrame = new ClientFrameController(); 

		aFrame.start(primaryStage);
	}

}
