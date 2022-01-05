package com.kerellpnz.restsmallapp.service;

import com.kerellpnz.restsmallapp.entity.Customer;

import java.util.List;


public interface CustomerService {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
}
