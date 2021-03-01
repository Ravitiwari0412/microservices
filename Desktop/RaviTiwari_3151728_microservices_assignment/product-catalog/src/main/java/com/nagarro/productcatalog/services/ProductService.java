package com.nagarro.productcatalog.services;

import java.util.List;

import com.nagarro.productcatalog.entities.Product;


public interface ProductService {
	
	List<Product> getAllProducts();
	String addNewBooking();

}
