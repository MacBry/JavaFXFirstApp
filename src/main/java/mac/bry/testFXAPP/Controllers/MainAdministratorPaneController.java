package mac.bry.testFXAPP.Controllers;

import java.io.IOException;
import java.util.List;

import com.mac.bry.krew.pepowiny.DButils.DBUserUtility;
import com.mac.bry.krew.pepowiny.entity.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class MainAdministratorPaneController {

	@FXML
	Pane AdministrationPane;
	
	@FXML
	private TableView<User> TableViewMainAdministratorPane;

	@FXML
	private List<User> data ;
	
	@FXML
	public void initialize() {
		DBUserUtility dbUserUtility = new DBUserUtility();
		
		data = dbUserUtility.getUsersList();

		ObservableList<User> obsList = FXCollections.observableArrayList(data);

		TableViewMainAdministratorPane.setItems(obsList);
		TableColumn<User, Integer>idCol = new TableColumn<User, Integer>("ID");
		TableColumn<User, String>loginCol = new TableColumn<User,String>("LOGIN");
		TableColumn<User, String>passwordCol = new TableColumn<User,String>("PASSWORD");
		TableColumn<User, Boolean>permissionCol = new TableColumn<User,Boolean>("PERMISSION");
	
		idCol.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
		loginCol.setCellValueFactory(new PropertyValueFactory<User, String>("login"));
		passwordCol.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
		permissionCol.setCellValueFactory(new PropertyValueFactory<User, Boolean>("permission"));
		
		TableViewMainAdministratorPane.getColumns().setAll(idCol, loginCol, passwordCol, permissionCol );
		//AdministrationPane.getChildren().add(TableViewMainAdministratorPane);
		
	}
	
	
}
