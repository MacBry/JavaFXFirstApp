package mac.bry.testFXAPP.Controllers;

import java.io.IOException;
import java.util.List;

import com.mac.bry.krew.pepowiny.DButils.DBUserUtility;
import com.mac.bry.krew.pepowiny.entity.User;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LoginPaneController {
	
	@FXML
	MainStackPaneController maintStackPaneController;
	
	DBUserUtility dbUserUtility = new DBUserUtility();
	
	public void setMaintStackPaneController(MainStackPaneController maintStackPaneController) {
		this.maintStackPaneController = maintStackPaneController;
	}

	@FXML
	TextField LoginTextBoxLoginPane;
	
	@FXML
	PasswordField PasswordTextBoxLoginPane;
	
	@FXML
	Button LoginButtonLoginPane;
	
	@FXML
	Label labelLoginPane;
	
	@FXML
	public void initialize() {
	}
	
	@FXML
	public void LoginOnActionEventLoginPane() {
		String tempLogin = LoginTextBoxLoginPane.getText();
		String tempPassword = PasswordTextBoxLoginPane.getText();
		User tempUser = new User(tempLogin,tempPassword);
		
		if(dbUserUtility.loginCheck(tempUser)) {
			if(dbUserUtility.permissionCheck(tempUser)) {
				FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/MainAdministratorPane.fxml"));
				Pane pane = null;
				try {
					pane = fxmlLoader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}
							
				maintStackPaneController.setScreen(pane);
			}
			else {
				FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/MainUserPane.fxml"));
				Pane pane = null;
				try {
					pane = fxmlLoader.load();
				}catch (IOException e) {
					e.printStackTrace();
				}
				maintStackPaneController.setScreen(pane);
			}
		}
		else {
			labelLoginPane.setText("Blad Logowania");
		}
	}
}
