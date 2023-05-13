package com.bootcamp.basicclass11;

public class ReturnDemo {

	
	public String getEmployeeName() {
		return "Ram Panday";
	}
	
	public int getemployeeAge(int age) {
		
		if(age<10) {
			return 5;
		}else {
			return 100;
		}
	}
	
	
	public static void main(String[] args) {
		
		ReturnDemo demo = new ReturnDemo();
		String emplyeeName = demo.getEmployeeName();
		System.out.println("Employee Name : "+emplyeeName);
		
		
		int age =  demo.getemployeeAge(11);
		System.out.println("Age : "+age);
	}
}
