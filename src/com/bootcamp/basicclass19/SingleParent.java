package com.bootcamp.basicclass19;

public class SingleParent {
	
	protected int age; 
	protected String parentName;
	protected String address;
	
	public void setParent(int age, String parentName, String address) {
		this.age = age;
		this.parentName = parentName;
		this.address = address;
	}
	
	public void showParent() {
		System.out.println("Age : "+age);
		System.out.println("Parent Name : "+parentName);
		System.out.println("Address : "+address);
	}
	
}
