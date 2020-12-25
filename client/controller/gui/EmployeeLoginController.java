package gui;

import request.*;
import entities.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EmployeeLoginController implements Initializable {

	public static EmployeeLoginController EmployeeLoginController;

	@FXML
	private TextField TxtUserName;

	@FXML
	private PasswordField TxtPassword;

	@FXML
	private ImageView ImgLogo;

	@FXML
	private Button BtnLogin;

	@FXML
	private Button BtnBack;

	@FXML
	private Button Department;

	@FXML
	private Button Park;

	@FXML
	private Button Worker;

	@FXML
	private Button Service;

	@FXML
	private Label TxtError;

	@FXML
	void Login(ActionEvent event) {
		Login.requestLogin(TxtUserName.getText(), TxtPassword.getText(), event);
	}

	@FXML
	void GoBackToLogin(ActionEvent event) throws IOException {
		SetNewScene("/fxml/LoginPage.fxml", event);
	}

	@FXML
	void PDepartment(ActionEvent event) throws IOException {
		SetNewScene("/fxml/DepartmentManager.fxml", event);
	}

	@FXML
	void PPark(ActionEvent event) throws IOException {
		SetNewScene("/fxml/ParkManager.fxml", event);
	}

	@FXML
	void PService(ActionEvent event) throws IOException {
		SetNewScene("/fxml/ServiceWorker.fxml", event);
	}

	@FXML
	void PWorker(ActionEvent event) throws IOException {
		SetNewScene("/fxml/Worker.fxml", event);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EmployeeLoginController = this;
		ImgLogo.setImage(new Image("/Img/Logo.png"));

		BtnLogin.getStylesheets().add("/css/Btn.css");
		BtnBack.getStylesheets().add("/css/Btn.css");

		Department.getStylesheets().add("/css/Btn.css");
		Park.getStylesheets().add("/css/Btn.css");
		Worker.getStylesheets().add("/css/Btn.css");
		Service.getStylesheets().add("/css/Btn.css");
		TxtError.setVisible(false);
	}

	public void setLogin(Worker worker, ActionEvent event) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				FXMLLoader loader = new FXMLLoader();
				Pane root;
				System.out.println("--> setLogin --> ");
				try {
					Stage Stage = new Stage();
					System.out.println("--> fxml --> /fxml/" + worker.getRole() + ".fxml");
					root = loader.load(getClass().getResource("/fxml/" + worker.getRole() + ".fxml").openStream());
					((ControllerInterface) loader.getController())
							.setNameEmployee(worker.getFirstName() + " " + worker.getLastName());
					Scene scene = new Scene(root);
					Stage.setTitle("GoNature");
					Stage.setScene(scene);
					Stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				((Node) event.getSource()).getScene().getWindow().hide();
			}
		});

	}

	private void SetNewScene(String FXML, ActionEvent event) {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root;
		try {
			root = loader.load(getClass().getResource(FXML).openStream());
			Scene scene = new Scene(root);
			primaryStage.setTitle("GoNature");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setError(String msg) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				TxtError.setVisible(true);
				TxtError.setText(msg);
				TxtError.setAlignment(Pos.CENTER);
			}
		});
	}

}
