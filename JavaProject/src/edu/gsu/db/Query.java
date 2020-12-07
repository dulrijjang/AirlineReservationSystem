package edu.gsu.db;

public class Query {
	
	public static final String LOGIN = 
			"SELECT count(*) as num  "
			+ "FROM login_credentials "
			+ "WHERE username = ? AND password =?";
	
	public static final String REGISTER =
			"INSERT INTO login_credentials VALUES "
			+ "(\'?\', \'?\', \'?\', \'?\', \'?\', \'?\', \'?\', \'?\', \'?\', \'?\')";
			/* royaltyNumber
			 * firstName
			 * lastName
			 * loginID
			 * password
			 * email
			 * address
			 * zip
			 * state
			 * ssn
			 */

}
