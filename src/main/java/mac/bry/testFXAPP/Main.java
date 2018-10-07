package mac.bry.testFXAPP;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Stack Pane in pure Java
		//****************************************//
		
		//StackPane stackPane = new StackPane();
		//Button button = new Button("Przycisk");
		//stackPane.getChildren().add(button);
		//Scene scene = new Scene(stackPane,400,400);
		//primaryStage.setScene(scene);
		
		
		//Stack Pane from FXML file
		//****************************************//
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(this.getClass().getResource("/fxml/stackPaneWindow.fxml"));
		Pane Pane = fxmlLoader.load();
		Scene scene = new Scene(Pane);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("First JavaFx app");
		primaryStage.show();
		
		
	}

}
