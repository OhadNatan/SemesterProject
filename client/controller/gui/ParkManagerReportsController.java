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

public class ParkManagerReportsController implements Initializable {

	@FXML
    private AnchorPane AnchorReports;
	
    @FXML
    private Button BtnTotalVisitor;

    @FXML
    private ImageView ImgTotalVisitor;

    @FXML
    private Button BtnUsage;

    @FXML
    private ImageView ImgUsage;

    @FXML
    private Button BtnMonthlyIncome;

    @FXML
    private ImageView ImgMonthlyIncome;

    @FXML
    void OpenMonthlyIncome(ActionEvent event) throws IOException {
		SetAnchor("/fxml/MonthlyIncomeReport.fxml");
    }

    @FXML
    void OpenTotalVisitor(ActionEvent event) throws IOException {  	
		SetAnchor("/fxml/TotalVisitorReport.fxml");
    }

    @FXML
    void OpenUsage(ActionEvent event) throws IOException {
    	SetAnchor("/fxml/UsageReport.fxml");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ImgTotalVisitor.setImage(new Image("/Img/TotalVisitor.png"));
		ImgUsage.setImage(new Image("/Img/Usage.png"));
		ImgMonthlyIncome.setImage(new Image("/Img/MonthlyIncome.png"));

		BtnTotalVisitor.getStylesheets().add("/css/IconBtn.css");
		BtnUsage.getStylesheets().add("/css/IconBtn.css");
		BtnMonthlyIncome.getStylesheets().add("/css/IconBtn.css");
		
	}
	
	private void SetAnchor(String FXML) throws IOException {
		AnchorReports.getChildren().clear();;
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource(FXML).openStream());
		AnchorReports.getChildren().add(root);
	}

}
