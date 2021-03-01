package com.nagarro.professionals.entities;

public class Professional {
	private int proId;
	private String proName;
	private int age;
	private String email;
	private String profession;
	private String area;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
//	public Professional() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Professional(int proId, String proName, int age, String email, String profession, String area) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.age = age;
		this.email = email;
		this.profession = profession;
		this.area = area;
	}
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobName() {
		return profession;
	}
	public void setJobName(String jobName) {
		this.profession = jobName;
	}
	

}
