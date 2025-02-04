package com.eruk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eruk.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
