package mac.bry.testFXAPP.Controllers;

import java.io.IOException;
import java.util.List;

import com.mac.bry.krew.pepowiny.DButils.DBUserUtility;
import com.mac.bry.krew.pepowiny.entity.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

public class MainAdministratorPaneController {

	@FXML
	private TableView<User> TableViewMainAdministratorPane;
	
	private MainStackPaneController mainStackPaneController;
	
	
	public void setMainStackPaneController(MainStackPaneController mainStackPaneController) {
		this.mainStackPaneController = mainStackPaneController;
	}

	@FXML
	private List<User> data ;
	
	@FXML
	public void initialize() {
		DBUserUtility ut = new DBUserUtility();
		
		FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/fxml/MainAdministratorPane.fxml"));
		Pane pane = null;
		try {
			pane = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		data = ut.getUsersList();
		for(User u : data) {
			System.out.println(u.getLogin());
		}
		ObservableList<User> obsList = FXCollections.observableArrayList(data);
		TableViewMainAdministratorPane.setItems(obsList);
		mainStackPaneController.setScreen(pane);
	}
	
}
