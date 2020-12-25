package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ServiceWorkerNewGuideController implements Initializable {

    @FXML
    private ComboBox<Integer> CbNumberVisitor;

    @FXML
    private TextField TxtFieldIdNumber;

    @FXML
    private Button BtnSave;

    @FXML
    void Save(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		BtnSave.getStylesheets().add("/css/Btn.css");

		CbNumberVisitor.getItems().addAll(generator());
		
	}
	
	private Integer[] generator() {
		int size = 15;
		Integer[] result = new Integer[size];
		for (int i = 1; i < result.length; i++)
			result[i] = (int) (i);
		return result;
	}

}
