package com.nagarro.booking.entities;



public class Booking {
	private int customerId;
	private int bookingId;
	private String productName;
	private String bookingDate;
	private status bookingStatus;
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
	public Booking(int customerId,int bookingId, String productName, String bookingDate, status bookingStatus) {
		super();
		this.customerId = customerId;
		this.bookingId = bookingId;
		this.productName = productName;
		this.bookingDate = bookingDate;
		this.bookingStatus = bookingStatus;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingName() {
		return productName;
	}
	public void setBookingName(String bookingName) {
		this.productName = bookingName;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public status getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(status bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	

}
