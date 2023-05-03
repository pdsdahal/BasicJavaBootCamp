package com.bootcamp.basicclass3;

public class WideningTypeCastingDemo {
	
	public static void main(String[] args) {
		
		byte num1 = 127;
		int num1Int = num1;
		System.out.println("Byte to int : "+num1Int);
		
		int num2 = 345678;
		double num2Double = num2;
		System.out.println("Int to Double : "+num2Double);
		
		float num3 = 345678.45678f;
		double num3Double = num3;
		System.out.println("Float to Double : "+num3Double);
		
	}

}
