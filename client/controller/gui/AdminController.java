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

public class AdminController extends ControllerInterface {

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
	private Button BtnDepartmentReport;

	@FXML
	private ImageView ImgDReports;

	@FXML
	private Button BtnApprovalList;

	@FXML
	private ImageView ImgApprovalList;

	@FXML
	private Button BtnNewFamily;

	@FXML
	private ImageView ImgNewFamily;

	@FXML
	private Button BtnNewGuide;

	@FXML
	private ImageView ImgNewGuide;

	@FXML
	private Button BtnViewAccount;

	@FXML
	private ImageView ImgViewAccount;

	@FXML
	private Button BtnChange;

	@FXML
	private ImageView ImgChange;

	@FXML
	private Button BtnParkReport;

	@FXML
	private ImageView ImgPReports;

	@FXML
	private Button BtnNewOrder;

	@FXML
	private ImageView ImgNewOrder;

	@FXML
	private Button BtnOrderManagement;

	@FXML
	private ImageView ImgOrderManagement;

	@FXML
	private AnchorPane TempAnchor;

	@FXML
	void GoHome(ActionEvent event) {
		setAnchor("/fxml/AdminHome.fxml");

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
	void OpenApprovalList(ActionEvent event) {
		setAnchor("/fxml/DepartmentManagerApprovalList.fxml");
	}

	@FXML
	void OpenChange(ActionEvent event) {
		setAnchor("/fxml/ParkManagerChange.fxml");
	}

	@FXML
	void OpenNewFamily(ActionEvent event) {
		setAnchor("/fxml/ServiceWorkerNewFamily.fxml");
	}

	@FXML
	void OpenNewGuide(ActionEvent event) {
		setAnchor("/fxml/ServiceWorkerNewGuide.fxml");
	}

	@FXML
	void OpenNewOrder(ActionEvent event) {
		setAnchor("/fxml/ServiceNewOrder.fxml");
	}

	@FXML
	void OpenOrderManagement(ActionEvent event) {
		setAnchor("/fxml/ServiceOrderManagement.fxml");
	}

	@FXML
	void OpenDepartmentReport(ActionEvent event) {
		setAnchor("/fxml/DepartmentManagerReports.fxml");
	}

	@FXML
	void OpenParkReport(ActionEvent event) {
		setAnchor("/fxml/ParkManagerReports.fxml");
	}

	@FXML
	void OpenViewAccount(ActionEvent event) {
		setAnchor("/fxml/WorkerViewAccount.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgLogo.setImage(new Image("/Img/Logo.png"));
		ImgApprovalList.setImage(new Image("/Img/ApprovalList.png"));
		ImgLogOut.setImage(new Image("/Img/Logout.png"));
		ImgPReports.setImage(new Image("/Img/Reports.png"));
		ImgDReports.setImage(new Image("/Img/Reports.png"));
		ImgChange.setImage(new Image("/Img/ApprovalList.png"));
		ImgNewOrder.setImage(new Image("/Img/NewOrder.png"));
		ImgOrderManagement.setImage(new Image("/Img/OrderManagement.png"));
		ImgNewGuide.setImage(new Image("/Img/Guide.png"));
		ImgNewFamily.setImage(new Image("/Img/Family.png"));
		ImgViewAccount.setImage(new Image("/Img/ViewAccount.png"));

		BtnApprovalList.getStylesheets().add("/css/IconBtn.css");
		BtnLogo.getStylesheets().add("/css/IconBtn.css");
		BtnLogOut.getStylesheets().add("/css/IconBtn.css");
		BtnDepartmentReport.getStylesheets().add("/css/IconBtn.css");
		BtnChange.getStylesheets().add("/css/IconBtn.css");
		BtnParkReport.getStylesheets().add("/css/IconBtn.css");
		BtnNewOrder.getStylesheets().add("/css/IconBtn.css");
		BtnOrderManagement.getStylesheets().add("/css/IconBtn.css");
		BtnNewFamily.getStylesheets().add("/css/IconBtn.css");
		BtnNewGuide.getStylesheets().add("/css/IconBtn.css");
		BtnViewAccount.getStylesheets().add("/css/IconBtn.css");

		setAnchor("/fxml/AdminHome.fxml");
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
