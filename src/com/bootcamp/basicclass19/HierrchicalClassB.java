package com.bootcamp.basicclass19;

public class HierrchicalClassB extends HierrchicalClassA {

	public void showAreaOfCircle() {
		double areCircle = super.findAreaOfCircle();
		System.out.println("Area of Circle is : " + areCircle);
	}

	public static void main(String[] args) {
		HierrchicalClassB childB = new HierrchicalClassB();
		childB.setVariables(5, 3, 5);
		childB.showAreaOfCircle();
	}
}
