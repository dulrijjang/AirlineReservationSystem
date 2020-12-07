package edu.gsu.gui;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public void register(String loginID, String password, 
				String firstName, String lastName, String email, 
				String address, String zip, String state, String ssn) {
			
			Customer c1 = new Customer();
			
			c1.setRoyaltyNumber();
			c1.setLoginID(loginID);
			c1.setPassword(password);
			c1.setFirstName(firstName);
			c1.setLastName(lastName);
			c1.setEmail(email);
			c1.setAddress(address);
			c1.setZip(zip);
			c1.setState(state);
			c1.setSSN(ssn);
			c1.setAction(Action.REGISTER);

	}

}
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