package Shopping.authentication.dao;

import java.util.List;

import Shopping.authentication.customer.Customer;

public interface RegistrationDao {

	public int create(List<Customer> lst);
	
}
