package edu.gsu.gui;

import edu.gsu.common.Customer;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BoBoTourLoginPage extends Application {
	
	Stage window;

	public static void main(String [] args) {
		
		launch(args);
		
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("BoBo Tour LoginPage");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(10,10,10,10));
		grid.setHgap(5.0);
		grid.setVgap(5.0);
		
		Label loginID = new Label("Login ID   :");
		GridPane.setConstraints(loginID, 0, 0);
		
		TextField text1 = new TextField();
		text1.setPromptText("Login ID");
		GridPane.setConstraints(text1, 1, 0);
		
		Label password = new Label("Password :");
		GridPane.setConstraints(password, 0, 1);
		
		TextField text2 = new TextField();
		text2.setPromptText("Password");
		GridPane.setConstraints(text2, 1, 1);
		
		Button loginButton = new Button("Login");
		GridPane.setConstraints(loginButton, 1, 2);
		loginButton.setOnAction(e -> login(text1.getText(), text2.getText()));
		
		
		
		grid.getChildren().addAll(loginID, text1, password, text2, loginButton);
		
		Scene scene1 = new Scene(grid, 300, 200);
		
		window.setScene(scene1);
		window.show();
		
	}
	
	public void login(String loginID, String password) {
		
		Customer c1 = new Customer();
		
		c1.setLoginID(loginID);
		c1.setPassword(password);
		
		
		
		
		
	}
	


}
