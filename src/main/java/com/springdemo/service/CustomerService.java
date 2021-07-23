package com.springdemo.service;

import java.util.List;

import com.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int id);

	void delete(int id);
}
