package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ServiceOrderManagementController implements Initializable {

	@FXML
    private AnchorPane AnchorOrderManagement;
	
    @FXML
    private Button BtnExistingOrder;

    @FXML
    private ImageView ImgExistingOrder;

    @FXML
    private Button BtnWaitingListOrder;

    @FXML
    private ImageView ImgWaitingList;

    @FXML
    void OpenExistingOrder(ActionEvent event) {
    	SetAnchor("/fxml/ServiceExistingOrder.fxml");
    }

    @FXML
    void OpenWaitingListOrder(ActionEvent event) {
    	SetAnchor("/fxml/ServiceWaitingListOrder.fxml");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgExistingOrder.setImage(new Image("/Img/ExistingOrder.png"));
		ImgWaitingList.setImage(new Image("/Img/WaitingList.png"));
		
		BtnExistingOrder.getStylesheets().add("/css/IconBtn.css");
		BtnWaitingListOrder.getStylesheets().add("/css/IconBtn.css");	
	}
	private void SetAnchor(String FXML) {
		AnchorOrderManagement.getChildren().clear();
		FXMLLoader loader = new FXMLLoader();
		Pane root;
		try {
			root = loader.load(getClass().getResource(FXML).openStream());
			AnchorOrderManagement.getChildren().add(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
