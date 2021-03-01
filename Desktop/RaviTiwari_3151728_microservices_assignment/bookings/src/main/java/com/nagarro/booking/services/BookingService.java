package com.nagarro.booking.services;

import java.util.ArrayList;

import com.nagarro.booking.entities.Booking;
import com.nagarro.booking.entities.CustomerBookings;

public interface BookingService {
	
	CustomerBookings getCustomerBooking(int customerId);
	String addNewBooking(Booking booking);

}
