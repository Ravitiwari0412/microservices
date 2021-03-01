package com.nagarro.admin.entities;

public class WorkOrder {
		private int proId;
		private int workOrderId;
		private String workDateTime;
		private String address;
		private String workOrderCategory;
		private Status workOrderStatus;
		
		public WorkOrder() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public WorkOrder(int proId, int workOrderId, String workDateTime, String address, String workOrderCategory,
				Status workOrderStatus) {
			super();
			this.proId = proId;
			this.workOrderId = workOrderId;
			this.workDateTime = workDateTime;
			this.address = address;
			this.workOrderCategory = workOrderCategory;
			this.workOrderStatus = workOrderStatus;
		}

		public int getProId() {
			return proId;
		}

		public void setProId(int proId) {
			this.proId = proId;
		}

		public int getWorkOrderId() {
			return workOrderId;
		}
		public void setWorkOrderId(int workOrderId) {
			this.workOrderId = workOrderId;
		}
		public String getWorkDateTime() {
			return workDateTime;
		}
		public void setWorkDateTime(String workDateTime) {
			this.workDateTime = workDateTime;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getWorkOrderCategory() {
			return workOrderCategory;
		}
		public void setWorkOrderCategory(String workOrderCategory) {
			this.workOrderCategory = workOrderCategory;
		}
		public Status getWorkOrderStatus() {
			return workOrderStatus;
		}
		public void setWorkOrderStatus(Status workOrderStatus) {
			this.workOrderStatus = workOrderStatus;
		}
		
	
}
