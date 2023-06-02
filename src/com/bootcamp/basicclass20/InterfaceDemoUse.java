package com.bootcamp.basicclass20;

//child implement parent
public class InterfaceDemoUse implements InterfaceDemo {

	public void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("The sum of "+num1 + " + "+num2 + " = "+sum);
	}

	public int sub(int num1, int num2) {
	
		int result = num1-num2;
		return result;
	}

	public double div(double num1, double num2) {
	
		double result = num1/num2;
		return result;
	}

	public String getResults(String name) {
	
		String result = "Texes international College";
		return result;
	}

	
	public static void main(String[] args) {
		
		InterfaceDemoUse child = new InterfaceDemoUse();
		child.add(10, 12);
		
	}

	@Override
	public void setUpBrowser() {
		
		String borwserName = brwserNameEdge;
		if(borwserName=="Edge") {
			
		}
		//chrome
		
		//fire
		
		//safari
		
		//edge
	}

	@Override
	public void lunchURL() {
		
		
		
	}

	@Override
	public void shutDown() {
		
		
	}
	
	
	//single , mi
	
	
}
