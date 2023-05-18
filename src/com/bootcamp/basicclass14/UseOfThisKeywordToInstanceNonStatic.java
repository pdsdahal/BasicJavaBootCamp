package com.bootcamp.basicclass14;

public class UseOfThisKeywordToInstanceNonStatic {
	
	private  int age;
	private  String name;
	private  double salary;
	
	
	public void setAttributes(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	
		String address = "Kathmandu Nepal";
		
		this.showAttributesValues(address);
	}
	
	
	public void showAttributesValues(String address) {
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Address : "+address);
	}
	
	
}
