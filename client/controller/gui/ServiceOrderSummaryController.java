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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ServiceOrderSummaryController implements Initializable {

	public static ServiceOrderSummaryController SOSC;
	
	@FXML
    private Button BtnChangeOrderDetails;

    @FXML
    private Button BtnConfirm;

    @FXML
    private Button Submitted;

    @FXML
    private Button Waiting;

    @FXML
    private Label TxtID;

    @FXML
    private Label TxtOrderNumber;

    @FXML
    private Label TxtNumberOfVisitors;

    @FXML
    private Label TxtDateTime;

    @FXML
    private Label TxtParkName;

    @FXML
    private Label TxtTotalPrice;

    
    @FXML
    private ImageView ImgLogo;

    @FXML
    void BackToNewOrder(ActionEvent event) {
    	((Node) event.getSource()).getScene().getWindow().hide();
    }

    @FXML
    void OpenEnterdList(ActionEvent event) {
    	((Node) event.getSource()).getScene().getWindow().hide();
    	setNewScene("/fxml/EnterWaitingList.fxml");
    }

    @FXML
    void OpenOrderSubmitted(ActionEvent event) throws IOException {
    	((Node) event.getSource()).getScene().getWindow().hide();
		setNewScene("/fxml/OrderSubmitted.fxml");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ImgLogo.setImage(new Image("/Img/Logo.png"));
		
		BtnChangeOrderDetails.getStylesheets().add("/css/Btn.css");
		BtnConfirm.getStylesheets().add("/css/Btn.css");
		Submitted.getStylesheets().add("/css/Btn.css");
		Waiting.getStylesheets().add("/css/Btn.css");		
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
	
	public void setTxtID(String value) {
		TxtID.setText(value);
	}
	
	public void setTxtDateTime(String value) {
		TxtDateTime.setText(value);
	}
	
	public void setTxtNumberOfVisitors(String value) {
		TxtNumberOfVisitors.setText(value);
	}
	
	public void setTxtOrderNumber(String value) {
		TxtOrderNumber.setText(value);
	}
	
	public void setTxtParkName(String value) {
		TxtParkName.setText(value);
	}
	
	public void setTxtTotalPrice(String value) {
		TxtTotalPrice.setText(value);
	}

}
