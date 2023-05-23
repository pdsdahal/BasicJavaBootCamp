package com.bootcamp.basicclass17;

public class EmployeeMethodOverriedParent {

	private int parentAge;
	private String parentName;

	public void setParentInfo(int parentAge, String parentName) {

		System.out.println("Inside the paret...");
		this.parentAge = parentAge;
		this.parentName = parentName;
	}

	public void showInfo() {

		System.out.println("Parent Age : " + parentAge);
		System.out.println("Parent Name : " + parentName);
	}

	public static void main(String[] args) {

		// run time polymorphism

		EmployeeMethodOverriedParent referenceParent = new EmployeeMethodOverriedChild();
		referenceParent.setParentInfo(90, "Hari Dahal");
		referenceParent.showInfo();

	}

}
