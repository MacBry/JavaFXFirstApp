package mac.bry.testFXAPP.Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainStackPaneController {
	
	
	@FXML
	StackPane MainStackPane;
	
	@FXML
	public void initialize() {
		FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/LoginPane.fxml"));
		Pane pane = null;
		try {
			pane = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setScreen(pane);
		
		
		LoginPaneController loginPaneController = fxmlLoader.getController();
		loginPaneController.setMaintStackPaneController(this);
		
	}

	public void setScreen(Pane pane) {
		MainStackPane.getChildren().clear();
		MainStackPane.getChildren().add(pane);
	}
}
