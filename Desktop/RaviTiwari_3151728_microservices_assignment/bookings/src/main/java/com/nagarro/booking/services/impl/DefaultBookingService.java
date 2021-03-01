package com.nagarro.booking.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nagarro.booking.entities.Booking;
import com.nagarro.booking.entities.CustomerBookings;
import com.nagarro.booking.entities.status;
import com.nagarro.booking.services.BookingService;

@Service
public class DefaultBookingService implements BookingService {
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	static List<CustomerBookings> customerBookings = new ArrayList<CustomerBookings>() {
		/**
		 *
		 */
		private static final long serialVersionUID = 5673200189392382138L;

		{
			add(new CustomerBookings(1, new ArrayList<Booking>() {
				/**
				 *
				 */
				private static final long serialVersionUID = 1764240923325655332L;

				{
					add(new Booking(1,101,"Barber","23-02-2021",status.cancelled));
					add(new Booking(1,102,"Body massage","23-02-2021",status.cancelled));
					add(new Booking(1,111,"Electrician","23-02-2021",status.scheduled));

				}
			}));
			add(new CustomerBookings(2, new ArrayList<Booking>() {
				/**
				 *
				 */
				private static final long serialVersionUID = 1764240923325655332L;

				{
					add(new Booking(2, 103,"Hair cut with facial","22-02-2021",status.completed));
					add(new Booking(2, 104,"Full Body massage","23-02-2021",status.cancelled));
					add(new Booking(2, 112,"Plumber","23-02-2021",status.scheduled));

				}
			}));

		}
	};
	
	
			                                                        
	

	
	@Override
	public CustomerBookings getCustomerBooking(int customerId) {
		// TODO Auto-generated method stub
		

		
		try {

			for (final CustomerBookings customerBooking : customerBookings) {
				if (customerBooking.getCustomerId() == customerId) {
					return customerBooking;
				}
			}
			return null;
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String addNewBooking(Booking booking) {
		// TODO Auto-generated method stub
		try {

			for (CustomerBookings customerBooking : customerBookings) {
					if (customerBooking.getCustomerId() == booking.getCustomerId()) {
						System.out.println(booking);
						customerBooking.addBooking(booking);
						return "Booking Added Successfully";
					}
				}
				return null;
			} catch (final Exception e) {
				e.printStackTrace();
			}
			return null;
	}

	
	
	
	
//	public CustomerBookings getAllScheduledOrders() {
//		
//		
//	}

}
