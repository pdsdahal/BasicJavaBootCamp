package com.bootcamp.basicclass8;

public class NestedIfStatement {

	public static void main(String[] args) {

		int num = -11;

		if (num > 0) {

			System.out.println("Number is positive.");

			boolean oddCheck = num % 2 != 0;

			if (oddCheck) {
				System.out.println("Num is odd : " + num);
			} else {
				System.out.println("Num is even : " + num);
			}

		} else {
			System.out.println("num is negative : " + num);
			
			// -11<= -10
			if(num <= -10) {
				System.out.println("Number <= -10");
			}else {
				System.out.println("number >= -10" );
			}

		}

	}

}
