package mac.bry.testFXAPP.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

	@FXML
	private Button button;
	
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
	}
	
	@FXML
	public void onMouseEnteredButton() {
		System.out.println("you are pointing button - onMouseEnteredButton method");
	}
}
