package com.bootcamp.basicclass19;

public class HierrchicalClassC extends HierrchicalClassA {

	public void showAreaOfRectangle() {
		double areaRect = super.findAreaRect();
		System.out.println("Area of Rectangle is : " + areaRect);
	}
	
	
	public static void main(String[] args) {
		
		HierrchicalClassC  childC = new HierrchicalClassC();
		childC.setVariables(40, 3, 4);
		childC.showAreaOfRectangle();
	}

}