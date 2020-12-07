package edu.gsu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.gsu.common.Customer;
import edu.gsu.common.Flight;
import edu.gsu.exceptions.LoginException;

public class DBQuery{
	
	public static void main(String[] args) throws Exception {
		
		Customer c1 = new Customer();
		login(c1);
		
	}
	
	public static void login(Customer c1) throws Exception {
			
		Connection conn = null;
		
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/?user=root?iseTimezone=true&serverTimezone=UTC";
			String username = "root";
			String password = "Xkwhdkf1@";
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,username,password);	
			System.out.println("Connected");

			// Create a statement
			PreparedStatement ptmt = conn.prepareStatement(Query.LOGIN);
				    
			ptmt.setString(1, c1.getLoginID());
			ptmt.setString(2, c1.getPassword());
			
			// Execute a statement
			
			ResultSet rs1 = ptmt.executeQuery();
			
			int count = 0;

			// Iterate through the result and print the student names
			while (rs1.next()) {
				System.out.println("Number of Users:" + rs1.getInt(1));
				count = rs1.getInt(1);
			}
			
			if (count == 0)
				throw new LoginException("Incorrect LoginID or Password!");
				     
	    
		} catch (SQLException e) {
			
			System.out.println(e);
			throw e;
		}
		finally {
			
			conn.close();
		}
	}    
	
	
	
	
	public static void getFlights(Customer customer) throws Exception {
		
		// can I run a query on reservation table that select all teh rows with customerID comes from co
		
		Flight f1 = new Flight();
		f1.setAirline("BoBo Airline 001");
		
		Flight f2 = new Flight();
		f2.setAirline("BoBo Airline 002");
		
		Flight f3 = new Flight();
		f3.setAirline("Bobo Airline 003");
		
		customer.getFlights().add(f1);
		customer.getFlights().add(f2);
		customer.getFlights().add(f3);
		
	}
	
	
}
