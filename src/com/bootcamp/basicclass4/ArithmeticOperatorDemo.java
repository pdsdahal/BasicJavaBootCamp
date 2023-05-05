package com.bootcamp.basicclass4;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {

		double num1 = 10;
		double num2 = 20;

		//
		
		int sub = (int) (num1 - num2);//10-20
		double div = num1 / num2;//10/20
		int mul = (int) (num1 * num2);//10*20
		int add = (int) (num1 + num2);//10+20
		int rem = (int) (num1 % num2);//10%20

		System.out.println(" -  = "+sub);
		System.out.println(" /  = "+div);
		System.out.println(" *  = "+mul);
		System.out.println(" +  = "+add);
		System.out.println(" %  = "+rem);
		
		
		// int / int = int 
		// double / double  = double
		
		
		int a = 2;
		int b = 4;
		int result1 = a*a/b + a*b/a;// 2*2/4+ 2*4/2 = 4/4 +  8/2 = 1+4 = 5
		int result2 = a*(a/b+b/a);//2*(2/4+4/2)= 2*(0+2) = 2*2 = 4
		
		System.out.println("Result 1: "+result1);
		System.out.println("Result 2: "+result2);

	}

}
