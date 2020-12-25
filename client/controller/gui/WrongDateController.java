package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WrongDateController implements Initializable {

	@FXML
	private ImageView ImgLogo;

	@FXML
	private Button BtnBack;

	@FXML
	private Button BtnWaitingList;

	@FXML
	private Button BtnAlternativeDate;

	@FXML
	void GoBack(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();

	}

	@FXML
	void OpenAlternativeDate(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();
		setNewScene("/fxml/AlternativeDate.fxml");
	}

	@FXML
	void OpenWaitingList(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();
		setNewScene("/fxml/ServiceOrderSummary.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgLogo.setImage(new Image("/Img/Logo.png"));

		BtnBack.getStylesheets().add("/css/Btn.css");
		BtnWaitingList.getStylesheets().add("/css/Btn.css");
		BtnAlternativeDate.getStylesheets().add("/css/Btn.css");

	}
	
	private void setNewScene(String FXML) {
		FXMLLoader loader = new FXMLLoader();
		Stage primaryStage = new Stage();
		Pane root;
		try {
			root = loader.load(getClass().getResource(FXML).openStream());
			Scene scene = new Scene(root);
			primaryStage.setTitle("Login");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
