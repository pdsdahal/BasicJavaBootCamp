package com.bootcamp.basicclass18;

public class Parent {

	private String familyName;
	protected String address;
	
	public void setParentDetails(String familyName, String address) {
		this.familyName = familyName;
		this.address = address;
	}
	
	public void showDetails() {
		
		System.out.println("Family Name : "+familyName);
		System.out.println("Address : "+address);
	}
	
	
}
