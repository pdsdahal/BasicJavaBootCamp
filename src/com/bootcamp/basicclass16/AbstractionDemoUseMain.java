package com.bootcamp.basicclass16;


//child extends parent
public class AbstractionDemoUseMain extends AbstractionDemo {

	public void setEmployeeName(String employeeName, int age, String address) {
		System.out.println("EmpleeName : " + employeeName);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
	}

	public String getEEmployeeDetails() {
		return null;
	}

	public double getTotlNumber() {
		return 0;
	}

	

	public void findSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);

	}

	
	public int findMax(int num1, int num2) {

		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}


	public void findDiff(int num1, int num2) {
		
		int sub = num1 - num2;
		System.out.println("Sub of " + num1 + " - " + num2 + " = " + sub);

	}
	
	public void show() {
		
	}
	
	
	public static void main(String[] args) {
		AbstractionDemoUseMain demo = new AbstractionDemoUseMain();
		demo.setEmployeeName("Shyam Panday", 13, "Nepal");
		
		demo.findDiff(10, 5);
	}


}
