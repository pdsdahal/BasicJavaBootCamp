package com.bootcamp.basicclass4;

public class MethodDeclaration {
	
	public void addition() {
		int num1 = 100;
		int num2 = 200;
		int result = num1+num2;
		System.out.println("The sum of "+num1 + " + "+num2 + " = "+result);
	}
	
	void sum(int num1, int num2) {
		
		int sum = num1 + num2;
		System.out.println("The sum of "+num1 + " + "+num2 + " = "+sum);
	}
	
	private double div(double num1, double num2) {
		
		double result = num1/num2;
		return result;
	}
	
	public String getInfo(String name, String address) {

		return "Name : "+name + "\nAddress : "+address;
	}
	
	
	static void mul() {
		int num1 = 10;
		int num2 = 7;
		int result = num1*num2;
		System.out.println(num1 +" * "+num2 + " = "+result);
	}
	
	public static void multiplication(int num1, int num2) {
		int result = num1*num2;
		System.out.println(num1 +" * "+num2 + " = "+result);
	}
	
	public static boolean setFlag() {
		return true;
	}
	
	private static String setAddress() {
		return "Kathmandu Nepal";
	}
	
	public static void main(String[] args) {
		
		MethodDeclaration declaration = new MethodDeclaration();
		double resultDiv = declaration.div(20, 5);
		System.out.println("20/5 = "+resultDiv);
		
	}
}
