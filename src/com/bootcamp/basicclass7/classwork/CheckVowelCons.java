package com.bootcamp.basicclass7.classwork;

import java.util.Scanner;

public class CheckVowelCons {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char data = scanner.nextLine().charAt(0);
		
		
		//vowel  = a,e,i,o,u
		
		boolean vowelConCheck = (data == 'a') || (data == 'e') || data == 'i' || data == 'o' || data == 'u' ||
				data == 'A' || data == 'E' || data == 'I' || data == 'O' || data == 'U';
				
		
		if(vowelConCheck) {
			System.out.println(data + " is vowel.");
		}else {
			System.out.println(data+ " is consonenet.");
		}
		
		scanner.close();
	}
	
}
