package mac.bry.testFXAPP.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class StackPaneController {

	@FXML
	private Button button;
	
	@FXML
	private Label labael1;
	
	@FXML
	private VBox VBOX;
	
	public StackPaneController() {
		System.out.println("I am a Controller");
	}
	
	@FXML
	void initialize() {
		button.setText("Nowa Nazwa");
	}
	
	@FXML
	public void onActionButton() {
		System.out.println("On Action method");
		labael1.setText("onActionButton");
	}
	
	@FXML
	public void onMouseEnteredButton() {
		System.out.println("you are pointing button - onMouseEnteredButton method");
		labael1.setText("you are pointing button - onMouseEnteredButton method");
	}
	@FXML
	public void VBoxOnMouseEntered() {
		System.out.println("you are pointing button - VBoxOnMouseEntered method");
		labael1.setText("you are pointing nothing - VBoxOnMouseEntered");
	}
}
