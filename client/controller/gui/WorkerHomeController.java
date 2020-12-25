package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WorkerHomeController implements Initializable {

    @FXML
    private Label TxtNumberOfVisitors;

    @FXML
    private Button BtnUpdate;

    @FXML
    private ImageView ImgUpdate;

    @FXML
    void Update(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgUpdate.setImage(new Image("/Img/Update.png"));
		
		BtnUpdate.getStylesheets().add("/css/IconBtn.css");
		
	}

}
