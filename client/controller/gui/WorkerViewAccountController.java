package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WorkerViewAccountController implements Initializable {

    @FXML
    private TextField TxtFieldID;

    @FXML
    private Button BtnEnter;

    @FXML
    void EnterID(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		BtnEnter.getStylesheets().add("/css/Btn.css");
		
	}

}
