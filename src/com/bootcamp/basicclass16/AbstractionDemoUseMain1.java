package com.bootcamp.basicclass16;

public class AbstractionDemoUseMain1 extends AbstractionDemo {

	public void setEmployeeName(String employeeName, int age, String address) {
		System.out.println(employeeName + " " + age + " " + address);

	}

	public String getEEmployeeDetails() {
		return null;
	}

	public double getTotlNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void findSum(int num1, int num2) {

	}

	public int findMax(int num1, int num2) {

		if (num2 > num1) {
			return num2;
		} else {
			return num1;
		}
	}

	public void findDiff(int num1, int num2) {

		int diff = num2 - num1;
		System.out.println("Sub " + num2 + " - " + num1 + " = " + diff);

	}

	public void show() {

	}

	public static void main(String[] args) {

		AbstractionDemoUseMain1 main1 = new AbstractionDemoUseMain1();
		main1.setEmployeeName("Hari Rawat", 10, "Nepal");

		main1.findDiff(10, 5);
	}

}
