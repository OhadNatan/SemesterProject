package gui;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {


    @FXML
    private Button BtnVisitor;

    @FXML
    private ImageView ImgVisitor;

    @FXML
    private Button BtnWorker;

    @FXML
    private ImageView ImgWorker;

    @FXML
    private ImageView ImgLogo;
    
    @FXML
    void VisitorButton(ActionEvent event) {
		SetNewScene("/fxml/TravelerLogin.fxml" , event );
    }

    @FXML
    void WorkerButton(ActionEvent event) {
		SetNewScene("/fxml/EmployeeLogin.fxml" , event );
    }


	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginPage.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ImgWorker.setImage(new Image("/Img/worker.png"));
		ImgVisitor.setImage(new Image("/Img/Visitor.png"));
    	ImgLogo.setImage(new Image("/Img/Logo.png"));
		
    	BtnVisitor.getStylesheets().add("/css/IconBtn.css");
    	BtnWorker.getStylesheets().add("/css/IconBtn.css");
    	
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
