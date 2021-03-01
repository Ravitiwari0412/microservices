package com.nagarro.productcatalog.services.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.productcatalog.entities.Category;
import com.nagarro.productcatalog.entities.Product;

import com.nagarro.productcatalog.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DefaultProductService implements ProductService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	List<Product> services = Arrays.asList(
			new Product(1, "Salon for women", 400, Category.SALON, 4),
			new Product(2,"Salon for men", 300, Category.SALON, 5),
			new Product(3, "Massage for women", 400, Category.MASSAGE, 4),
			new Product(4,"Massage for men", 300, Category.MASSAGE, 5),
			new Product(5, "Painters", 400, Category.PAINTERS, 4),
			new Product(6,"Plumbers", 300, Category.PLUMBERS, 5)
			);

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return services;
	}

	@Override
	public String addNewBooking() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
