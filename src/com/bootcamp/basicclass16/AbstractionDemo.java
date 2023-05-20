package com.bootcamp.basicclass16;

public  abstract class AbstractionDemo {

	//abstract method
	
	
	public abstract void setEmployeeName(String employeeName, int age, String address);
	public abstract String getEEmployeeDetails();
	public abstract double getTotlNumber();
	
	//aritmatic
	
	public abstract void findSum(int num1, int num2);
	public abstract int findMax(int num1, int num2);
	public abstract void findDiff(int num1, int num2);
	
	public abstract void show();
	
	//public abstract int showBankDetails();
	
	
	
	
	
	//final variables 
	public final String employeeName="";
	
	
	//static method with body
	public static  void showDetails() {
		System.out.println("Inside the show details static method non absract method");
		System.out.println("Name : Ram Panday");
		
	}
	
	
	public  void showDetailsEmp() {
		System.out.println("Inside the showDetailsEmp non absract method");
		System.out.println("Name : Ram Panday");
		
	}
	
	
}
