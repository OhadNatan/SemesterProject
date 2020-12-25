package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ServiceExistingOrderController implements Initializable {

	@FXML
    private TableView<?> TbkExistingOrder;

    @FXML
    private TableColumn<?, ?> ColOrderNumber;

    @FXML
    private TableColumn<?, ?> ColStatus;

    @FXML
    private TableColumn<Void, Void> ColAction;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	

}
