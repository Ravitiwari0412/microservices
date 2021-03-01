package com.nagarro.workorders.services.impl;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import com.nagarro.workorders.entities.Category;
import com.nagarro.workorders.entities.ProfessionalWorkOrders;
import com.nagarro.workorders.entities.Status;
import com.nagarro.workorders.entities.WorkOrder;
import com.nagarro.workorders.services.WorkOrderService;

@Service
public class DefaultWorkOrderService implements WorkOrderService {

	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	static List<ProfessionalWorkOrders> professionalWorkOders = new ArrayList<ProfessionalWorkOrders>() {
		/**
		 *
		 */
		private static final long serialVersionUID = 5673200189392382138L;

		{
			add(new ProfessionalWorkOrders(1, new ArrayList<WorkOrder>() {
				/**
				 *
				 */
				private static final long serialVersionUID = 1764240923325665332L;

				{
					add(new WorkOrder(1,101,"22-02-2021","Delhi - 110084", "ELECTRICIANS", Status.ACCEPTED));
					add(new WorkOrder(1,102,"22-02-2021","Delhi - 110086", "PLUMBERS", Status.ACCEPTED));

				}
			}));
			add(new ProfessionalWorkOrders(2, new ArrayList<WorkOrder>() {
				/**
				 *
				 */
				private static final long serialVersionUID = 1764240923375655332L;

				{
					add(new WorkOrder(2,103,"22-02-2021","Delhi - 110084", "BARBER", Status.REJECTED));
					add(new WorkOrder(2,104,"22-02-2021","Delhi - 110073", "MASSAGE", Status.ACCEPTED));

				}
			}));

		}
	};
	
	@Override
	public ProfessionalWorkOrders getWorkOrders(int proId) {
		try {
			for (ProfessionalWorkOrders professionalWorkOder : professionalWorkOders) {
				if (professionalWorkOder.getProId() == proId) {
					return professionalWorkOder;
				}
			}
			return null;
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String addNewWorkOrder(WorkOrder workOrder) {
		// TODO Auto-generated method stub
		
		try {
			for (ProfessionalWorkOrders professionalWorkOder : professionalWorkOders) {
				if (professionalWorkOder.getProId() == workOrder.getProId()) {
					professionalWorkOder.addWorkOrder(workOrder);
					return "work Order Added Succesfully";
				}
			}
			return null;
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String acceptWorkOrder(int proId, int workOrderId) {
		try {
			for (ProfessionalWorkOrders professionalWorkOder : professionalWorkOders) {
				if (professionalWorkOder.getProId() == proId) {
					List<WorkOrder> workOrders = professionalWorkOder.getWorkOrders();
					for (WorkOrder workOrder : workOrders) {
						if(workOrder.getWorkOrderId()==workOrderId) {
							workOrder.setWorkOrderStatus(Status.ACCEPTED);
							return "work Order Accepted";
						}
					}
				}
			}
			return null;
				
				
			
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String rejectWorkOrder(int proId, int workOrderId) {
		// TODO Auto-generated method stub
		try {
			for (ProfessionalWorkOrders professionalWorkOder : professionalWorkOders) {
				if (professionalWorkOder.getProId() == proId) {
					List<WorkOrder> workOrders = professionalWorkOder.getWorkOrders();
					for (WorkOrder workOrder : workOrders) {
						if(workOrder.getWorkOrderId()==workOrderId) {
							workOrder.setWorkOrderStatus(Status.REJECTED);
							return "work Order Rejected";
						}
					}
				}
			}
			return null;
	
			} catch (final Exception e) {
				e.printStackTrace();
			}
			return null;
	}

}
