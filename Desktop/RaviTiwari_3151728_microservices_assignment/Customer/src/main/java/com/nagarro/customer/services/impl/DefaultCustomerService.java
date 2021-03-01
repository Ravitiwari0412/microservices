package com.nagarro.customer.services.impl;

import com.nagarro.customer.entities.Customer;
import com.nagarro.customer.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DefaultCustomerService implements CustomerService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

		
	public static List<Customer> customers = new ArrayList<Customer>() {
		/**
		 *
		 */
		private static final long serialVersionUID = 3248390977533895954L;

		{
			add(new Customer(1, "Vineet ", "Delhi", "Vineet.agarwal@sample.com"));
			add(new Customer(2, "John doe", "Mumbai", "JohnDoe@sample.com"));

		}
	};
	@Override
	public Customer getCustomerDetails(int CustomerId) {
		// TODO Auto-generated method stub
		try {
			for (final Customer customer : customers) {
				if (customer.getCustomerId() == CustomerId) {
					return customer;
				}
			}
			return null;
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
