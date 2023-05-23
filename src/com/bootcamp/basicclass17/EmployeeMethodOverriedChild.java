package com.bootcamp.basicclass17;

public class EmployeeMethodOverriedChild extends EmployeeMethodOverriedParent {

	private int childAge;
	private String childName;
	
	public void setParentInfo(int childAge, String childName) {
		this.childAge = childAge;
		this.childName = childName;
	}
	
	public void showInfo() {
		System.out.println("Child Age : "+childAge);
		System.out.println("Child Name : "+childName);
	}
	
	public static void main(String[] args) {
		
		//run time polymorphism
		
		EmployeeMethodOverriedParent referenceParent = new EmployeeMethodOverriedChild();
		referenceParent.setParentInfo(90, "Hari Dahal");
		referenceParent.showInfo();
		
	}
	
	
}
