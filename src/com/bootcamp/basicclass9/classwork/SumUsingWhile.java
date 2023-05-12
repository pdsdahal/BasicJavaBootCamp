package com.bootcamp.basicclass9.classwork;

public class SumUsingWhile {

	public static void main(String[] args) {

		// 1+2+3+4...+1000

		int num = 1;
		int sum = 0;

		while (num < 10) {

			sum = sum + num;
			
			System.out.println("Number : "+num);
			num++;
		}

		System.out.println("Result : " + sum);

	}

}
