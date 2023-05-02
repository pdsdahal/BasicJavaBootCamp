package com.bootcamp.basicclass2;

public class StaticVariableDemo {

	private static int age=100;
	public static String name="Gita";
	static boolean flag = true;
	
	//method
		public static void showDetails() {
			System.out.println("From showDetails method");
			System.out.println("Name : "+name);
			System.out.println("Result Flag : "+flag);
		}
	
	public static void main(String[] args) {
		//first way -- inside the same class
		System.out.println("Age : "+age);
	
		
		//second way --access from outside the class
		System.out.println("Name : "+StaticVariableDemo.name);
	
		StaticVariableDemo.showDetails();
		
	}	
}
