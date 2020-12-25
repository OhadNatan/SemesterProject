package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ServiceWorkerNewFamilyController implements Initializable {

	@FXML
	private AnchorPane AnchorNewFamily;

	@FXML
	private TextField TxtFieldFirstName;

	@FXML
	private TextField TxtFieldLastName;

	@FXML
	private TextField TxtFieldIDNumber;

	@FXML
	private TextField TxtFieldTelNumber;

	@FXML
	private TextField TxtFieldEmail;

	@FXML
	private ComboBox<Integer> CbFamilyMembers;

	@FXML
	private TextField TxtFieldCreditNumber;

	@FXML
	private Button BtnSave;

	@FXML
	void Save(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/fxml/SubscriptionNumber.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		BtnSave.getStylesheets().add("/css/Btn.css");

		CbFamilyMembers.getItems().addAll(generator());
	}

	private Integer[] generator() {
		int size = 15;
		Integer[] result = new Integer[size];
		for (int i = 1; i < result.length; i++)
			result[i] = (int) (i);
		return result;
	}

}
