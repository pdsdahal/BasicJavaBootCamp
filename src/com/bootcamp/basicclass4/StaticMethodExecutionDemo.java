package com.bootcamp.basicclass4;

public class StaticMethodExecutionDemo {
	
	public static void main(String[] args) {
		
		//static method call
		MethodDeclaration.mul();
		
		MethodDeclaration.multiplication(400, 10);
		
		boolean result =  MethodDeclaration.setFlag();
		System.out.println("Result : "+result);
	}
}
