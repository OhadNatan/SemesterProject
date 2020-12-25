package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ParkChangeController implements Initializable {

    @FXML
    private Button BtnSave;

    @FXML
    private ImageView ImgSave;

    @FXML
    void Save(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgSave.setImage(new Image("/Img/Save.png"));

		BtnSave.getStylesheets().add("/css/IconBtn.css");
		
	}

}
