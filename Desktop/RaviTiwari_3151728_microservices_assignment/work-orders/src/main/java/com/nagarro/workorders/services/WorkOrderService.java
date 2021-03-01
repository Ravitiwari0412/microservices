package com.nagarro.workorders.services;

import com.nagarro.workorders.entities.ProfessionalWorkOrders;
import com.nagarro.workorders.entities.WorkOrder;

public interface WorkOrderService {
	
	ProfessionalWorkOrders getWorkOrders(int proId);
	String addNewWorkOrder(WorkOrder workOrder);
	String acceptWorkOrder(int proId, int workOrderId);
	String rejectWorkOrder(int proId, int workOrderId );

}
