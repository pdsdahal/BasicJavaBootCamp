package com.bootcamp.basicclass7.classwork;

import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String[] args) {
		
		
		int num ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		num = scanner.nextInt();
		
		
		//1,2,3,4,5,6,7,8,9,10...
	//1,3,5,7,9-- odd 
		// 2,4,6,8 --even 
		
		boolean oddEvenCheck = num%2 == 0;
		
		if(oddEvenCheck) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
		
		scanner.close();
		
	}

}
