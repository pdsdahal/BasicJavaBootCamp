package com.bootcamp.basicclass19;

public class MutilevelClassC  extends MutilevelClassB{
	
	public void findSum() {
		
		super.findMul();
		
		int resultSum =  super.num1 + super.num2;
		System.out.println("Sum  is : "+super.num1 + " + "+super.num2 + " = "+resultSum);
		super.sum = resultSum;
	}
	
	
	public static void main(String[] args) {
		
		MutilevelClassC childc = new MutilevelClassC();
		childc.setNubers(10, 4);
		childc.findSum();
	}

}
