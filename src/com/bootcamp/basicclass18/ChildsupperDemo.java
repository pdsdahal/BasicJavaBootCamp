package com.bootcamp.basicclass18;

public class ChildsupperDemo extends PrentsupperDemo {

	private int num3;
	
	public ChildsupperDemo(int num1, int num2, int num3) {
		
		super(num1, num2); // it is calling parent class constructor-- super method
		this.num3 = num3;
		
	}
	
	public void findMul() {
		int mul =  num1 * super.num2; //parent class variables --super keyword 
		System.out.println(super.num1 + " * "+super.num2 + " = "+mul);
		
		//
		
		add();
		
	}
	
	
	public static void main(String[] args) {
		ChildsupperDemo child = new ChildsupperDemo(5, 5, 12);
		child.findMul();
			
	}
	
}
