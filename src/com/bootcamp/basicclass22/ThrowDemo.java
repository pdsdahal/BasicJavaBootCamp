package com.bootcamp.basicclass22;

import java.util.Scanner;

public class ThrowDemo {

	public void showData(int age) {
		
		if(age < 0) {
			throw new IllegalArgumentException("Age can not be negative.");
		}else {
			System.out.println("Age : "+age);
		}
		
	}
	
	public static void main(String[] args) {
		
		ThrowDemo demo = new ThrowDemo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age ");
		int age = scanner.nextInt();
		
		try {
			demo.showData(age);
			System.out.println("Age is valid");
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid Age");
			System.out.println("Reason : "+e.getMessage());
		}
		System.out.println("I am at the end...");
		scanner.close();
		
	}
}
