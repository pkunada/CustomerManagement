package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;


import io.swagger.annotations.Api;

@RestController
@Api(value="CustomerManagementAPI")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(path = "/customer/all", method = RequestMethod.GET , produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer() {

		return (List<Customer>) customerRepository.findAll();
	}

	@RequestMapping(path = "/customer/{customerId}", method = RequestMethod.GET , produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomerById(@PathVariable(name = "customerId") int customerId) {

		Customer cust = customerRepository.findOne(customerId);

		return cust;
	}

	@RequestMapping(path = "/customer/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void saveCustomer(@RequestBody Customer cust) {

		customerRepository.save(cust);

	}

	@RequestMapping(path = "customer/{fName}/{fValue}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomerByFieldName(@PathVariable(name = "fName") String fName,
			@PathVariable(name = "fValue") String fValue) {

		if (fName.equalsIgnoreCase("customerName")) {

			return customerRepository.findByCustomerName(fValue);
		}

		if (fName.equalsIgnoreCase("customerPhone")) {

			return customerRepository.findByCustomerPhone(fValue);
		}

		if (fName.equalsIgnoreCase("customerAddress")) {

			return customerRepository.findByCustomerAddress(fValue);
		}

		return null;

	}
	
	
	@RequestMapping(path="/customer/remove/{customerId}",method=RequestMethod.DELETE)
	public void removeCustomerById(@PathVariable(name="customerId") int customerId){
		
		customerRepository.delete(customerId);;
		
	}

}
