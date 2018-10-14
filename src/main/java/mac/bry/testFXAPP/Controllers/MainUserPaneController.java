package mac.bry.testFXAPP.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MainUserPaneController {
	
	@FXML
	LoginPaneController loginPaneController;
	
	public void setLoginPaneController(LoginPaneController loginPaneController) {
		this.loginPaneController = loginPaneController;
	}

	@FXML
	TabPane TabPaneMainUserPane;
	
	@FXML
	AnchorPane UserListTabPaneMainUserPane;
	
	@FXML
	AnchorPane HospitalListTabPaneMainUserPane;
	
	@FXML
	private Pane MainUserPane;
	
	@FXML
	private Button AddUserMainUserPane;
	
	@FXML
	private Button AddHospitalMainUserPane;
	
	@FXML
	public void initialize() {
		
	}
	
	@FXML
	public void AddUserOnAction () {
		
	}

	@FXML
	public void addHospitalOnAction () {
		
	}
	
	public void setSize() {
		MainUserPane.setMinSize(500, 400);
	}
}
