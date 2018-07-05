package com.foobar.repository;

import java.util.ArrayList;
import java.util.List;

import com.foobar.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.foobar.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Saikat");
		customer.setLastName("Banerjee");
		
		customers.add(customer);
		
		return customers;
	}
}
