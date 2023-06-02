package com.bootcamp.basicclass21;

import java.util.Scanner;

public class BasicReasonOfException {
	
	public static void main(String[] args) {
		
		//input is in String-- Int
		String inputData = "1";
		int data =  Integer.parseInt(inputData);
		System.out.println("Data : "+data);
		
		int number = 234;
		String resultNumber =  String.valueOf(number);
		
		
		
		String inputName = "Panday";
		int lenght = inputName.length();
		System.out.println("Length : "+lenght);

		int[] ages = {1,5,9,20,56};//0,1,2,3,4...
		System.out.println("Fourth index element : "+ages[4]);
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int number1 = scanner.nextInt();
		
		System.out.println("Entered Number is : "+number1);
		
		System.out.println("Eeter a byte data ");
		byte input =  scanner.nextByte();
		System.out.println("Byte data : "+input);
		
		
		
		scanner.close();
		
		
		
	}

}
