package com.nagarro.booking.entities;

import java.util.ArrayList;
import java.util.List;

public class CustomerBookings {
	private int customerId;
	private List<Booking> bookings;
	
	public CustomerBookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerBookings(int customerId, List<Booking> bookings) {
		super();
		this.customerId = customerId;
		this.bookings = bookings;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public void addBooking(Booking booking) {
		this.bookings.add(booking);
	}
	
	

}
