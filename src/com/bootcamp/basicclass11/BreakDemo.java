package com.bootcamp.basicclass11;

public class BreakDemo {

	public static void main(String[] args) {

		//break use in looping statement
		for (int i = 1; i < 10; i++) {// 1=1 1<10
			System.out.println("Value of i : " + i);

			for (int j = 1; j < 10; j++) {

				System.out.println("Value of j : " + j);
				break;
			}

		}
		
	
		
		//break use in switch statement
		int num1 = 2;
		switch (num1) {

		case 1:
			System.out.println("Case -1");
			break;

		case 2://2==2
			System.out.println("Case -2");
			break;

		default:
			System.out.println("No match");

		}

	}

}
