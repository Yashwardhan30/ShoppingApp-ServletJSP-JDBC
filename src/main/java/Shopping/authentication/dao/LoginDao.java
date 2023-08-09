package Shopping.authentication.dao;

import Shopping.authentication.customer.Customer;

public interface LoginDao {

	public Customer searchRecord(String uname);
	
}
