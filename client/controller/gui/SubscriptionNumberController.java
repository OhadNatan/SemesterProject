package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SubscriptionNumberController implements Initializable {

    @FXML
    private ImageView ImgLogo;

    @FXML
    private Label TxtSubscriptionNumber;

    @FXML
    private Button BtnExit;

    @FXML
    void Exit(ActionEvent event) {
    	((Node) event.getSource()).getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgLogo.setImage(new Image("/Img/Logo.png"));
		
		BtnExit.getStylesheets().add("/css/Btn.css");
		
	}

}
