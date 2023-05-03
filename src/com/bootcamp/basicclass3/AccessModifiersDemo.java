package com.bootcamp.basicclass3;

public class AccessModifiersDemo {

	// private
	private int rollNo;

	// public
	public String name;

	// default
	double salary;

	// protected
	protected boolean flag = true;

	public void showStudentName() {
		System.out.println("Public method : showStudentName");
	}

	private void showStudentAddress() {
		System.out.println("Public method : showStudentAddress");
	}

	void showStudentRollNo() {
		System.out.println("Default method : showStudentRollNo");
	}
	
	protected void showStudentAge() {
		System.out.println("Protected method : showStudentAge");
	}
}
