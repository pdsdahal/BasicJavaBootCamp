package com.bootcamp.basicclass15;

public class MathematicalOperationDemo {
	
	private int num1;
	private int num2;
	
	private int sum;
	private double div;
	private int mul;
	private int sub;
	private int mod;
	
	public MathematicalOperationDemo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getSum() {
		sum = num1+num2;
		return sum;
	}
	
	public double getDiv() {
		div= num1/num2;
		return div;
	}
	
	public void getMul() {
		mul = num1*num2;
		System.out.println(num1 +" * "+num2 + " = "+mul);
	}
	
	public void getSub() {
		sub = num1-num2;
		System.out.println(num1 +" - "+num2 + " = "+sub);
	}
	
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 6;
		
		MathematicalOperationDemo demo = new MathematicalOperationDemo(num1, num2);
		int sum  = demo.getSum();
		System.out.println(num1 + " + "+num2 + " = "+sum);
		
		demo.getMul();
		
	}
	

}
