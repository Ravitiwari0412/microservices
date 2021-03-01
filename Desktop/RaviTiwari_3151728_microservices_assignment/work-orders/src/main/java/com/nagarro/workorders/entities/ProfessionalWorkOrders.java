package com.nagarro.workorders.entities;

import java.util.List;

public class ProfessionalWorkOrders {
	private int proId;
	private List<WorkOrder> workOrders;
	
	public ProfessionalWorkOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfessionalWorkOrders(int proId, List<WorkOrder> workOrders) {
		super();
		this.proId = proId;
		this.workOrders = workOrders;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public List<WorkOrder> getWorkOrders() {
		return workOrders;
	}
	public void setWorkOrders(List<WorkOrder> workOrders) {
		this.workOrders = workOrders;
	}
	public void addWorkOrder(WorkOrder workOrder) {
		this.workOrders.add(workOrder);
	}
	

}
