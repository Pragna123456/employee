package com.eruk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eruk.model.Customer;
import com.eruk.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer saveRecord(Customer customer) {
		Customer c=customerRepo.save(customer);
		
		
		return c;
	}

	@Override
	public Customer getOneRecord(int cid) {
		Customer customer=customerRepo.findById(cid).get();
			return customer;
	}

	@Override
	public List<Customer> getAllRecords() {
		  List<Customer>customers=customerRepo.findAll();
			
			return customers;
	}

	@Override
	public Customer updateRecord(Customer customer, int cid) {
			Customer oldrecord=	customerRepo.findById(cid).get();
			oldrecord.setFirstname(customer.getFirstname());
			oldrecord.setLastname(customer.getLastname());
			oldrecord.setAddress(customer.getAddress());
			oldrecord.setState(customer.getState());
			oldrecord.setEmail(customer.getEmail());
			oldrecord.setPhone(customer.getPhone());
			
			Customer c1=customerRepo.save(oldrecord);
	
			return c1;
	

	}
	@Override
	public void deleteRecord(int cid) {
		customerRepo.deleteById(cid);
	}

}
