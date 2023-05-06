package com.bootcamp.basicclass6;

import java.util.Scanner;

public class SimpleIfStatementDemo {
	
	public static void main(String[] args) {
		
		//enter a number and check whether it is even, if it is even subtract it by 1
		
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1 = scanner.nextInt();
		
		boolean checkFlag = num1%2==0;
		
		if(checkFlag) {
			int sub = num1 -1;
			System.out.println("Final Result : "+sub);
			
		}
		
		System.out.println("Outside the if block...");
		
		scanner.close();
		
	}
}
