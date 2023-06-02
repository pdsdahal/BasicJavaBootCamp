package com.bootcamp.basicclass20;

public class MultipleChildDemo implements MultipleParent1, MultipleParent2 {

	public void sub(int num1, int num2) {
		int sub = num1-num2;
		System.out.println(num1+ " - "+num2 + " = "+sub);
	}


	public void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(num1+ " + "+num2 + " = "+sum);
	}
	
	public static void main(String[] args) {
		
		MultipleChildDemo child = new MultipleChildDemo();
		child.sub(20, 34);
		child.add(10, 56);
	}

}
