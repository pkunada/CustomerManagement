package com.customer.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.customer.repository.CustomerRepository;

@Component
public class DbSeeder implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override	
	public void run(String... arg0) throws Exception {
	
		Customer cust1 = new Customer(1,"Bill Berry","8906543451","1 ParkLane, Somerset,NJ");
		
		Customer cust2 = new Customer(2,"Jack Hall","8765674567","90 Quest Drive, Somerset,NJ");
		
		Customer cust3 = new Customer(3,"Susan King","8906233451","65 Run Drive, Somerset,NJ");
		
		
		List<Customer> customers = Arrays.asList(cust1,cust2,cust3);
		
		customerRepository.save(customers);
		
	}

}
