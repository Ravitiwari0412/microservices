package com.nagarro.productcatalog.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.productcatalog.entities.Product;

import com.nagarro.productcatalog.services.ProductService;

@RestController
@RequestMapping(value = "/products")
@CrossOrigin
public class ProductController {
	
	@Resource
	public ProductService productService;
	
	@GetMapping(value = "/")
	public List<Product> getAllProducts(){
		try {

			return productService.getAllProducts();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
