package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Pessoa;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Pessoa> comb;
	
	@FXML
	private Button btAll;

	private ObservableList<Pessoa> obsList;
	
	@FXML
	public void onCombAction() {
		Pessoa pess = comb.getSelectionModel().getSelectedItem();
		System.out.println(pess);
		
	}
	
	@FXML
	public void onBtAllAcion() {
		for (Pessoa pessoa : comb.getItems()) {
			System.out.println(pessoa);
		}
		
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Pessoa> list = new ArrayList<>();
		list.add(new Pessoa(1, "Maria"));
		list.add(new Pessoa(2, "Francisco"));
		list.add(new Pessoa(1, "João"));

		obsList = FXCollections.observableArrayList(list);
		comb.setItems(obsList);

		Callback<ListView<Pessoa>, ListCell<Pessoa>> factory = lv -> new ListCell<Pessoa>() {
			
			@Override
			protected void updateItem(Pessoa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};

		comb.setCellFactory(factory);
		comb.setButtonCell(factory.call(null));

	}
}
