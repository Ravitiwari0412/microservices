package com.nagarro.productcatalog.entities;

public class Product {
	
	private int productId;
	private String productName;
	private int productPrice;
	private Category productCategory;
	private int avgProductRating;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, int productPrice, Category productCategory,
			int avgProductRating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.avgProductRating = avgProductRating;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Category getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
	public int getAvgProductRating() {
		return avgProductRating;
	}
	public void setAvgProductRating(int avgProductRating) {
		this.avgProductRating = avgProductRating;
	}

}
