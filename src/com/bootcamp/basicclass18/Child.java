package com.bootcamp.basicclass18;

public class Child extends Parent  {
	
	private String name;
	private int age;
	
	public void setChildDetails(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void showChildInfo() {
		
		System.out.println("Child Name : "+name);
		System.out.println("Child Age : "+age);
		System.out.println("Child Address : "+this.address);
	}
	
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.setParentDetails("Dahal", "Kathmandu");
		child.showDetails();
		
		child.setChildDetails("Ram Dahal", 11, "Baneshwor");
		child.showChildInfo();
		
	}
	

}
