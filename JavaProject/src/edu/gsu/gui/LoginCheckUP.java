package edu.gsu.gui;

import edu.gsu.bizlogic.BizLogicProcess;
import edu.gsu.common.Customer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class LoginCheckUP {
	
	public static boolean check(Customer c1) {
		
		try {
			
			BizLogicProcess.process(c1);
			
		}
		
		catch (Exception e) {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login Dialog");
			alert.setHeaderText("Please confirm your LoginID, Password");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
			
			return false;
			
			
		}
		
		return true;
		
	}

}
