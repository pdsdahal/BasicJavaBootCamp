package com.bootcamp.basicclass3;

public class AccessModifiersDemoAccess {
	
	
	public static void main(String[] args) {
		
		AccessModifiersDemo demo = new AccessModifiersDemo();
		
		System.out.println("protected : "+demo.flag);
		System.out.println("public : "+demo.name);
		System.out.println("Default : "+demo.salary);
		
		demo.showStudentAge();
		demo.showStudentName();
		demo.showStudentRollNo();
		
	}

}
