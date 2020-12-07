package edu.gsu.gui;

import edu.gsu.common.Action;
import edu.gsu.common.Customer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class AccountPage extends Application {
	
	private Customer customer;
	
	public AccountPage(Customer customer) {
		
		this.customer = customer;
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
