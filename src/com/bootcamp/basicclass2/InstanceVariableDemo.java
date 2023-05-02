package com.bootcamp.basicclass2;

public class InstanceVariableDemo {

	private int age=100;
	public String name="Hari";
	private boolean resultFlag = true;
	
	
	//method
	public void showDetails() {
		System.out.println("From showDetails method");
		System.out.println("Name : "+name);
		System.out.println("Result Flag : "+resultFlag);
		
	}

	public static void main(String[] args) {
		
		//create the object in java
		InstanceVariableDemo objectName = new InstanceVariableDemo();
		
		//access the instance variables from the main method
		System.out.println("Age Instance : "+objectName.age) ;
		System.out.println("Name Instance : "+objectName.name);
		System.out.println("Flag Instance : "+objectName.resultFlag);
		
		//way to call the method
		System.out.println("\n\n");
		objectName.showDetails();
		
		
		System.out.println("******\n\n");
		int age = 14;
		String name = "Ram Panday";
		System.out.println("Age Local : "+age) ;
		System.out.println("Name Local : "+name);
		
		
		
	}
	
}
