package mac.bry.testFXAPP.Controllers;

import com.mac.bry.krew.pepowiny.DButils.DBUserUtility;
import com.mac.bry.krew.pepowiny.entity.User;
import com.sun.prism.paint.Color;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class StackPaneController {

	private DBUserUtility dbUserutil; 
	
	@FXML
	private TextField LoginField;
	
	@FXML
	private Button LogIn;
	
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private VBox VBOX;
	
	@FXML
	private Label label;
	
	public StackPaneController() {
		System.out.println("I am a Controller");
	}
	
	@FXML
	void initialize() {
		LogIn.setText("Zaloguj");
		dbUserutil = new DBUserUtility();
	}
	
	@FXML
	public void OnActionLoginButton() {
		if(dbUserutil.loginCheck(new User(LoginField.getText(), passwordField.getText()))){
			label.setText("Zalogowales sie");
		}
		else label.setText("Nie zalogowany");
		
	}

}
