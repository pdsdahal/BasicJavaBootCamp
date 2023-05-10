package com.bootcamp.basicclass8.classwork;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;

		int sum = 0;
		do {

			System.out.println("Enter a positive number ");
			num = scanner.nextInt();

			if (num > 0) {
				sum  = sum+num;
			}

		} while (0 < num);// 0<-1

		System.out.println("Sum is : "+sum);
	}

}
