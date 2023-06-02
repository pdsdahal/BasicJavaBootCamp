package com.bootcamp.basicclass19;

public class MutilevelClassB extends MutilevelClassA {
	
	public void findMul() {
		int localMul =  super.num1 * super.num2;
		System.out.println("Multiplicaton of "+super.num1 + " * "+super.num2 + " = "+localMul);
		super.mul = localMul;
	}

}
