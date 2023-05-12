package com.bootcamp.basicclass10.classwork;

public class FactorialDemo {

	public static void main(String[] args) {
		
		/*
		4! = 4*3*2*1 = 24
				
		3! = n*(n-1)3*2*1 = 6
		*/
		
		//declare variable 
		int n;
		
		//initialization 
		int age = 20;
		
		
		int number = 4;
		
		int mul = 1;
		
		for(n=4; n>0;n--) {
			mul = mul*n;
		}
		
		System.out.println("Factorial of "+number +" = "+mul);
		
		
		
	}
}
