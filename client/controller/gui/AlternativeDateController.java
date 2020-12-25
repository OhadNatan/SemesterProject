package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AlternativeDateController implements Initializable {

	@FXML
    private ImageView ImgLogo;

    @FXML
    private Button BtnBack;

    @FXML
    private Label TxtTime;

    @FXML
    private ComboBox<String> CbDate;

    @FXML
    private ComboBox<String> CbTime;

    
    @FXML
    private Button BtnSetDateTime;

    @FXML
    void GoBack(ActionEvent event) {
    	((Node) event.getSource()).getScene().getWindow().hide();
    }

    @FXML
    void OpenNewOrder(ActionEvent event) {
    	((Node) event.getSource()).getScene().getWindow().hide();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgLogo.setImage(new Image("/Img/Logo.png"));
		BtnBack.getStylesheets().add("/css/Btn.css");
		BtnSetDateTime.getStylesheets().add("/css/Btn.css");
		TxtTime.setVisible(false);
		CbTime.setVisible(false);
		CbDate.getItems().addAll("12/20/20","15/05/21","13/06/19");
		
	}
	
	@FXML
    void OpenTime(ActionEvent event) {
		TxtTime.setVisible(true);
		CbTime.setVisible(true);
		CbTime.getItems().addAll("14:20","11:40","13:00");
		
    }

}
