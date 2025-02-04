package com.eruk.service;

import java.util.List;

import com.eruk.model.Customer;


public interface CustomerService {

	public Customer saveRecord(Customer customer);
	public Customer getOneRecord(int cid);
	public List<Customer> getAllRecords();
	public Customer updateRecord(Customer customer,int cid);
	public void deleteRecord(int cid);
}
