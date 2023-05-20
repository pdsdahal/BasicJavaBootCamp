package com.bootcamp.basicclass15;

public class EncapsulationDemo {

	private int studentId;
	private String studentName;
	private String gender;
	private String address;
	private double income;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		System.out.println("Get Gender method is invoked.");
		return gender;
	}

	public void setGender(String gender) {
		
		System.out.println("Set Gender method is invoked.");
		
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	
}
