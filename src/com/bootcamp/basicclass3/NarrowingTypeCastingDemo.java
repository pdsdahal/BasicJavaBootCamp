package com.bootcamp.basicclass3;

public class NarrowingTypeCastingDemo {

	public static void main(String[] args) {
		
		double num1 = 4567890.56789;
		int num1Double = (int) num1;
		System.out.println("Double to Int : "+num1Double);
		
		int num2 = 46789;
		byte num2Byte = (byte) num2;
		System.out.println("Int to byte : "+num2Byte);
		
		
	}
}
