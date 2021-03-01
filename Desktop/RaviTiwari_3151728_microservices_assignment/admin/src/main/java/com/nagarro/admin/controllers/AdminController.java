package com.nagarro.admin.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.admin.entities.Booking;
import com.nagarro.admin.entities.Customer;
import com.nagarro.admin.entities.Professional;
import com.nagarro.admin.entities.Status;
import com.nagarro.admin.entities.WorkOrder;

import org.springframework.cloud.stream.annotation.StreamListener;

@RestController
@EnableBinding(Processor.class)
public class AdminController {
	
	
	    @Autowired
        RestTemplate restTemplate;
	
	    @StreamListener(Processor.INPUT)
	    public void receivedBooking(Booking booking) {
	        System.out.println("Received employee details: " + booking);
	        System.out.println("Sending email and sms: "+ booking.getCustomerId());
	        
	        // getting customer id from bookings
	        int customerId= booking.getCustomerId();
	        
	        // getting customer work and area from customer-service using Id
	        Customer customer = restTemplate.getForObject("http://cutomer-service/customer/" +customerId , Customer.class);
	        String area = customer.getCustomerAddress();
	        String work = booking.getProductName();
	        System.out.println("response"+ work );
	        // Using work and area getting available professionals 
	        Professional professional = restTemplate.getForObject("http://professional-service/professional/" +work+"/"+area , Professional.class);
	        System.out.println("response"+ professional.getAge());
	        // adding or assigning order to available professional by creating new work-order
	        WorkOrder workOrder = new WorkOrder(professional.getProId(), 109, booking.getBookingDate(), customer.getCustomerAddress(), professional.getJobName(), Status.UNKNOWN);
	        
	        //Adding new work-order to workOrder service
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        HttpEntity<WorkOrder> request = new HttpEntity<WorkOrder>(workOrder, headers);
	        ResponseEntity<String> response = restTemplate.postForEntity("http://professional-service/professional/", request,String.class );
	        System.out.println("response"+ response);
	        
	    }

}
