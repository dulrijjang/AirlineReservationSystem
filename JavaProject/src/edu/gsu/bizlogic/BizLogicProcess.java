package edu.gsu.bizlogic;

import edu.gsu.common.Action;
import edu.gsu.common.Customer;
import edu.gsu.db.DBQuery;

public class BizLogicProcess {
	
	public static void process(Customer c1) throws Exception {
		
		switch (c1.getAction()) {
		
			case Action.LOGIN:
				
				DBQuery.login(c1);
				break;
				
			case Action.GET_FLIGHTS:
				
				DBQuery.getFlights(c1);
				break;	
				
			case Action.REGISTER:
				
				DBQuery.register(c1);
				break;
		
		}
		
	}

}
