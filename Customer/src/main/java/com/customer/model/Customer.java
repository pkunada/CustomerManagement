package com.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "customerId")
	private int customerId;
	private String customerName;
	private String customerPhone;
	private String customerAddress;
	
	
	public Customer(){
		
	}
	
	
	
	public Customer(int customerId, String customerName, String customerPhone, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerPhone() {
		return customerPhone;
	}



	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	
	
	
	
	
	
	

}
