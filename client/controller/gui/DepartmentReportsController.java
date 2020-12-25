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

public class DepartmentReportsController implements Initializable {

	@FXML
	private AnchorPane AnchorReports;

	@FXML
	private Button BtnVisitorReport;

	@FXML
	private ImageView ImgVisitorReport;

	@FXML
	private Button BtnCancellationReport;

	@FXML
	private ImageView ImgCancellationReport;

	@FXML
	void CancellationReport(ActionEvent event) throws IOException {
		SetAnchor("/fxml/CancellationReport.fxml");
	}

	@FXML
	void VisitorReport(ActionEvent event) throws IOException {
		SetAnchor("/fxml/VisitorReport.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgCancellationReport.setImage(new Image("/Img/CancellationReport.png"));
		ImgVisitorReport.setImage(new Image("/Img/VisitorReports.png"));

		BtnCancellationReport.getStylesheets().add("/css/IconBtn.css");
		BtnVisitorReport.getStylesheets().add("/css/IconBtn.css");
	}

	private void SetAnchor(String FXML) {
		AnchorReports.getChildren().clear();
		FXMLLoader loader = new FXMLLoader();
		Pane root;
		try {
			root = loader.load(getClass().getResource(FXML).openStream());
			AnchorReports.getChildren().add(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
