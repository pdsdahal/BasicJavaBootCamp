package com.bootcamp.basicclass25;

public class EmployeeImplClass implements EmployeeInterface {

	private String name;
	private int age;
	
	public void employeeDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

	public void employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String data() {
		
		int data = 200;
		return name + " , "+age;
	}

	public static void main(String[] args) {
		
		EmployeeImplClass demo = new EmployeeImplClass();
		demo.employee("sita Dahal", 13);
		demo.employeeDetails();
		
		String result = demo.data();
		System.out.println("Result : "+result);
	}
}
