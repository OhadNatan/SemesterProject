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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ServiceNewOrderController implements Initializable {

	@FXML
	private ComboBox<String> CbParkName;

	@FXML
	private ComboBox<Integer> CbNumberOfVisitors;

	@FXML
	private DatePicker CbDate;

	@FXML
	private ComboBox<String> CbTime;

	@FXML
	private TextField TxtFieldEmail;

	@FXML
	private Button BtnSetOrder;

	@FXML
	private Button Bill;

	@FXML
	private Button Wrong;

	@FXML
	void OpenBill(ActionEvent event) throws IOException {
		setNewScene("/fxml/ServiceOrderSummary.fxml");
	}

	@FXML
	void OpenWrongDate(ActionEvent event) {
		setNewScene("/fxml/WrongDate.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		BtnSetOrder.getStylesheets().add("/css/Btn.css");
		Bill.getStylesheets().add("/css/Btn.css");
		Wrong.getStylesheets().add("/css/Btn.css");

		CbParkName.getItems().addAll("Nataniya", "Tel Aviv", "Gan Hashlosha");
		CbNumberOfVisitors.getItems().addAll(generator());
		CbTime.getItems().addAll(generatorTime(8, 17));

	}

	private String[] generatorTime(int from, int to) {
		int size = (to - from);
		String[] result = new String[size];
		for (int i = from; i < to; i++) {
			result[i - from] = i + ":00";

		}
		return result;
	}

	private Integer[] generator() {
		int size = 15;
		Integer[] result = new Integer[size];
		for (int i = 1; i < result.length; i++)
			result[i] = (int) (i);
		return result;
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

}
