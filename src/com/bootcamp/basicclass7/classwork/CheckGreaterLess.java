package com.bootcamp.basicclass7.classwork;

public class CheckGreaterLess {
	
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 70;
	
		boolean resultCheck = num1 > num2;//10 > 70: false
		if(resultCheck) {
			System.out.println(num1 + " is greather than (If) "+num2);
		}else {
			System.out.println(num2 + " is greather than (else) "+num1);
		}
		
	}

}
