package edu.gsu.common;

import java.util.ArrayList;

public class Customer {
	
	private int royaltyNumber;
	private String firstName;
	private String lastName;
	private String loginID;
	private String password;
	private String email;
	private ArrayList<Flight> flights;
	private String action;
	
	public Customer() {
		
		flights = new ArrayList<>();
		
	}
	
	public int getRoyaltyNumber() {
		
		return royaltyNumber;
		
	}
	
	public void setRoyaltyNumber(int royaltyNumber) {
		
		this.royaltyNumber = royaltyNumber;
		
	}
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public String getLoginID() {
		
		return loginID;
		
	}
	
	public void setLoginID(String loginID) {
		
		this.loginID = loginID;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public void setPassword(String password) {
		
		this.password = password;
		
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	 public ArrayList<Flight> getFlights() {
		 
		 return flights;
		 
	 }
	 
	 public void setFlights(ArrayList<Flight> flights) {
		 
		 this.flights = flights;
		 
	 }
	 
	 public String getAction() {
		 
		 return action;
		 
	 }
	 
	 public void setAction(String action) {
		 
		 this.action = action;
		 
	 }
		
	
	
	 

}
