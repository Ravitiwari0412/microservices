package com.nagarro.customer.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.customer.entities.Customer;
import com.nagarro.customer.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
@CrossOrigin
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping(value = "{id}")
	public Customer getUserDetails(@PathVariable(value = "id") final int customerId) {
		try {
			return customerService.getCustomerDetails(customerId);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
