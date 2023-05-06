package com.bootcamp.basicclass6;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		//create a scanner object
		//taking integer numbers 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first number : ");
		int num1 = scanner.nextInt(); //	int num1 = 100;
		System.out.println("Integer : "+num1);
		
		
		System.out.println("Enter your salary ");
		double salary = scanner.nextDouble();
		System.out.println("Double : "+salary);
		
		System.out.println("Enter a boolean value : ");
		boolean flag = scanner.nextBoolean();
		System.out.println("Boolean : "+flag);
		
		scanner.nextLine();
		
		System.out.println("Enter a name : ");
		String name = scanner.nextLine();
		System.out.println("String "+name);
		
		
		scanner.close();
	}
}
