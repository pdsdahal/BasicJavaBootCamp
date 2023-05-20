package com.bootcamp.basicclass15;

public class NoArgumentConstructorEmployee {

	private int rollNo;
	private String emloyeeName;
	private String employeeAddress;
	
	
	public NoArgumentConstructorEmployee() {
		rollNo = 10;
		emloyeeName = "Ram Panday";
		employeeAddress = "Kathmandu Nepal";
	}
	
	public void showData() {
		System.out.println("Name : "+emloyeeName);
		System.out.println("Address : "+employeeAddress);
		System.out.println("Roll No : "+rollNo);
	}
	
	
	public static void main(String[] args) {
		
		NoArgumentConstructorEmployee demo = new NoArgumentConstructorEmployee();
		demo.showData();
	}
	
}
