package mac.bry.testFXAPP.Controllers;

import com.mac.bry.krew.pepowiny.DButils.DBUserUtility;
import com.mac.bry.krew.pepowiny.entity.User;
import com.sun.prism.paint.Color;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PaneController {

	private DBUserUtility dbUserutility;
	
	@FXML
	private Button LoginButtonFxID;
	
	@FXML
	private TextField LoginFieldFxID;
	
	@FXML
	private PasswordField PasswordFieldFxIF;
	
	@FXML
	private Label MsgLabelFxID;
	
	public PaneController() {
		System.out.println("I am a Controller");
		dbUserutility = new DBUserUtility();
	}
	
	@FXML
	void initialize() {
		dbUserutility = new DBUserUtility();
	}
	
	@FXML
	public void LoginButtonOnActionEvent() {
		String tempLogin = LoginFieldFxID.getText();
		String tempPassword = PasswordFieldFxIF.getText();
		
		if(dbUserutility.loginCheck(new User(tempLogin,tempPassword))) {
			MsgLabelFxID.setText("Zalogowano");
		}MsgLabelFxID.setText("Nie Zalogowano");
	}

}
