package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DepartmentController extends ControllerInterface {

	@FXML
	private Button BtnLogo;

	@FXML
	private ImageView ImgLogo;

	@FXML
	private Label TxtNameOfEmployee;

	@FXML
	private Button BtnLogOut;

	@FXML
	private ImageView ImgLogOut;

	@FXML
	private Button BtnReports;

	@FXML
	private ImageView ImgReports;

	@FXML
	private Button BtnApprovalList;

	@FXML
	private ImageView ImgApprovalList;

	@FXML
	private AnchorPane TempAnchor;

	@FXML
	void GoHome(ActionEvent event) throws IOException {
		
		setAnchor("/fxml/DepartmentManagerHome.fxml");
	}

	@FXML
	void LogOut(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/fxml/EmployeeLogin.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@FXML
	void OpenReports(ActionEvent event) throws IOException {
		setAnchor("/fxml/DepartmentManagerReports.fxml");
	}

	@FXML
	void OpenApprovalList(ActionEvent event) throws IOException {
		setAnchor("/fxml/DepartmentManagerApprovalList.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources)   {
		ImgLogo.setImage(new Image("/Img/Logo.png"));
		ImgApprovalList.setImage(new Image("/Img/ApprovalList.png"));
		ImgLogOut.setImage(new Image("/Img/Logout.png"));
		ImgReports.setImage(new Image("/Img/Reports.png"));

		BtnApprovalList.getStylesheets().add("/css/IconBtn.css");
		BtnLogo.getStylesheets().add("/css/IconBtn.css");
		BtnLogOut.getStylesheets().add("/css/IconBtn.css");
		BtnReports.getStylesheets().add("/css/IconBtn.css");
		
		setAnchor("/fxml/DepartmentManagerHome.fxml");
	}
	
	private void setAnchor(String FXML) {
		if (!TempAnchor.getChildren().isEmpty())
			TempAnchor.getChildren().remove(0);
		FXMLLoader loader = new FXMLLoader();
		Pane root;
		try {
			root = loader.load(getClass().getResource(FXML).openStream());
			TempAnchor.getChildren().add(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void setNameEmployee(String name) {
		TxtNameOfEmployee.setText(name);
	}

}
