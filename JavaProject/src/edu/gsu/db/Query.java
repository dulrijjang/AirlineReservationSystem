package edu.gsu.db;

public class Query {
	
	public static final String LOGIN = 
			"SELECT count(*) as num  "
			+ "FROM login_credentials "
			+ "WHERE username = ? AND password =?";

}
