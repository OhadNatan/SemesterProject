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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TravelerLoginController implements Initializable {

    @FXML
    private ImageView ImgLogo;

    @FXML
    private TextField TxtFieldIDSubscription;

    @FXML
    private Button BtnLogin;

    @FXML
    private Button BtnBack;

    @FXML
    private Button temp;

    @FXML
    void GoBackToLogin(ActionEvent event) {
    	SetNewScene("/fxml/LoginPage.fxml" ,event);
    }

    @FXML
    void Temp(ActionEvent event) {
    	SetNewScene("/fxml/Service.fxml" ,event);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgLogo.setImage(new Image("/Img/Logo.png"));

		BtnLogin.getStylesheets().add("/css/Btn.css");
		BtnBack.getStylesheets().add("/css/Btn.css");

		temp.getStylesheets().add("/css/Btn.css");
		
	}
	private void SetNewScene(String FXML ,ActionEvent event ) {
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

}
