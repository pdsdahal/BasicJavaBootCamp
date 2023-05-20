package com.bootcamp.basicclass15;

public class ParametrizedConstructorDemo {

	public ParametrizedConstructorDemo(String name, String address, double salary, int age) {
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
		System.out.println("Age : "+age);
	}
	
	
	public static void main(String[] args) {
			
		ParametrizedConstructorDemo demo = new ParametrizedConstructorDemo("Pankaj Dahal", "Nepal", 3456.34567, 11);
		
	}
}
