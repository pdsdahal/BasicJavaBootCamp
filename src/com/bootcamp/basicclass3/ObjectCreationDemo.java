package com.bootcamp.basicclass3;

public class ObjectCreationDemo {
	
	int num1 = 10;
	int num2 = 20;
	
	
	public static void main(String[] args) {
		
		ObjectCreationDemo demo = new ObjectCreationDemo();
		int localNum1 = demo.num1;
		int localNum2 = demo.num2;
		
		int result = localNum1 + localNum2;
		System.out.println("The sum of "+localNum1 + " + "+localNum2 + " = "+result);
		
	}

}
