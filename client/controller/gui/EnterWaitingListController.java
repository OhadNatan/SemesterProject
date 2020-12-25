package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class EnterWaitingListController implements Initializable {

	@FXML
	private ImageView ImgLogo;

	@FXML
	private Button BtnExit;

	@FXML
	void Exit(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		BtnExit.getStylesheets().add("/css/Btn.css");
	}

}
