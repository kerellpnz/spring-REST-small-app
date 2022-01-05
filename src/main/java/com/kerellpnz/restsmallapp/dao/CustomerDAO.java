package com.kerellpnz.restsmallapp.dao;

import com.kerellpnz.restsmallapp.entity.Customer;

import java.util.List;


public interface CustomerDAO {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
	
}
