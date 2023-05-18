package com.bootcamp.basicclass14;

public class DefaultConstructorDemo {
	
	
	private int num1;
	private int num2;
	private int sum;
	
	public DefaultConstructorDemo() {
		num1 = 100;
		num2 = 400;
		
		this.sum();
	}
	
	
	public void sum() {
		sum = num1+num2;
		System.out.println("the sum of "+num1 + " + "+num2 + " = "+sum);
		
	}
	
	
	public static void main(String[] args) {
		
		DefaultConstructorDemo constructorDemo = new DefaultConstructorDemo();
		
	}

}
