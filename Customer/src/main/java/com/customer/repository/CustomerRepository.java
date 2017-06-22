package com.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	public List<Customer> findByCustomerName(String customerName);
	
	public List<Customer> findByCustomerPhone(String customerPhone);
	
	public List<Customer> findByCustomerAddress(String customerAddress);
	
}