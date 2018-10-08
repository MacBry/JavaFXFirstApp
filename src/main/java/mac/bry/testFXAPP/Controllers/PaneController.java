package mac.bry.testFXAPP.Controllers;

import java.io.IOException;

import com.mac.bry.krew.pepowiny.DButils.DBUserUtility;
import com.mac.bry.krew.pepowiny.entity.User;
import com.sun.prism.paint.Color;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PaneController {

	public static final String ADMINISTRATOR_PANE = "/fxml/AdministratorPane.fxml";
	public static final String USER_PANE = "/fxml/UserPane.fxml";
	
	private DBUserUtility dbUserutility;
	
	@FXML
	private Pane LoginPane;
	
	@FXML
	private Button LoginButtonFxID;
	
	@FXML
	private TextField LoginFieldFxID;
	
	@FXML
	private PasswordField PasswordFieldFxIF;
	
	public PaneController() {
		System.out.println("I am a Controller");
		dbUserutility = new DBUserUtility();
	}
	
	@FXML
	void initialize() {
		dbUserutility = new DBUserUtility();
	}
	
	@FXML
	public void LoginButtonOnActionEvent() throws IOException {
		String tempLogin = LoginFieldFxID.getText();
		String tempPassword = PasswordFieldFxIF.getText();
		
		if(dbUserutility.loginCheck(new User(tempLogin,tempPassword))) {
			if(dbUserutility.permissionCheck(new User(tempLogin,tempPassword))) {
				FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource(ADMINISTRATOR_PANE));
					LoginPane = fxmlLoader.load();
					
			}
		}else ;
	}

}
