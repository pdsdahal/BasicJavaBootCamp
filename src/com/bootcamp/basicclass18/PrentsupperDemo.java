package com.bootcamp.basicclass18;

public class PrentsupperDemo {
	
	protected int num1;
	protected int num2;
	
	public PrentsupperDemo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {
		int sum = num1+num2;
		System.out.println(num1+" + "+num2 + " = "+sum);
	}
	

}
