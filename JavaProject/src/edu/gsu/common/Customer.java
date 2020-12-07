package edu.gsu.common;

import java.util.ArrayList;
import java.util.Random;

public class Customer {
	
	private int royaltyNumber;
	private String firstName;
	private String lastName;
	private String loginID;
	private String password;
	private String email;
	private String address;
	private String zip;
	private String state;
	private String ssn;
	private ArrayList<Flight> flights;
	private String action;
	
	public Customer() {
		
		flights = new ArrayList<>();
		
	}
	
	public int getRoyaltyNumber() {
		
		return royaltyNumber;
		
	}
	
	public void setRoyaltyNumber() {
		
		Random rand = new Random();
		
		royaltyNumber = rand.nextInt(10000);
		
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

	public String getAddress() {

		return address;

	}
	public void setAddress(String address) {

		this.address = address;

	}

	public String getZip() {

		return zip;

	}
	public void setZip(String zip) {

		this.zip = zip;

	}

	public String getState() {

		return state;

	}
	
	public void setState(String state) {

		this.state = state;
	}
	
	public String getSSN() {
		
		return ssn;
	}
	
	public void setSSN(String ssn) {
		
		this.ssn = ssn;
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
