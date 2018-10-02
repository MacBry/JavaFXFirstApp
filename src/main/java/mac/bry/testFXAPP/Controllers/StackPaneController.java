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
	public void initialize() {
		button.setText("Nowa Nazwa");
	}
}
