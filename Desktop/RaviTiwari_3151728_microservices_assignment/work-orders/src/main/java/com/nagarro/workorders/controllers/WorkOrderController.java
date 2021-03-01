package com.nagarro.workorders.controllers;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nagarro.workorders.entities.ProfessionalWorkOrders;
import com.nagarro.workorders.entities.WorkOrder;
import com.nagarro.workorders.services.WorkOrderService;

@RestController
@RequestMapping(value = "/workOrders")
@CrossOrigin
public class WorkOrderController {
	
	@Resource
	public WorkOrderService workOrderService;
	
	@GetMapping(value = "/{proId}")
	public ProfessionalWorkOrders getProfessionalWorkOrders(@PathVariable("proId") final int proId){
		try {
			
			return workOrderService.getWorkOrders(proId);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	@PostMapping("/newWorkOrder")
	public String addNewBooking(@RequestBody WorkOrder workOrder ) {
		try {
			
			return workOrderService.addNewWorkOrder(workOrder);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	@GetMapping(value = "/accept/{proId}/{workOrderId}")
	public String acceptWorkOrder(@PathVariable(value = "proId")final int proId, @PathVariable(value = "workOrderId") final int workOrderId) {
		
		try {
					
				return workOrderService.acceptWorkOrder(proId, workOrderId);
			} catch (final Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	
	@GetMapping(value = "/reject/{proId}/{workOrderId}")
	public String rejectWorkOrder(@PathVariable(value = "proId")final int proId, @PathVariable(value = "workOrderId") final int workOrderId) {
		
		try {
					
				return workOrderService.rejectWorkOrder(proId, workOrderId);
			} catch (final Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	
	

}
