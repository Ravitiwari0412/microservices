package com.nagarro.booking.controllers;

import javax.annotation.Resource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;

import com.nagarro.booking.entities.Booking;
import com.nagarro.booking.entities.CustomerBookings;
import com.nagarro.booking.services.BookingService;

@RestController
@RequestMapping(value = "/bookings")
@CrossOrigin
@EnableBinding(Processor.class)
public class BookingController {
	
	@Resource
	public BookingService bookingService;
	
	@Autowired
    private Processor processor;
	
	@GetMapping(value = "/{userId}")
	public CustomerBookings getCustomerBookings(@PathVariable("userId") final int userId){
		try {
			
			return bookingService.getCustomerBooking(userId);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	@PostMapping("/newBooking")
	@SendTo(Processor.OUTPUT)
	public String addNewBooking(@RequestBody Booking booking ) {
		try {
			processor.output().send(MessageBuilder.withPayload(booking).build());
			return bookingService.addNewBooking(booking);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

}
