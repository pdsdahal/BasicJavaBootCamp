package com.bootcamp.basicclass9.classwork;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int mulOfWhat = scanner.nextInt();
		
		int  flag = 1;
		
		while(flag <= 100) {
			
			int mulResult = mulOfWhat * flag;
			
			System.out.println(mulOfWhat +" * "+flag + " = "+mulResult);
			
			flag++;
			
		}
		
		scanner.close();
		
		
		
		
		
	}

}
