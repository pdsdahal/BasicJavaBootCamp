package com.bootcamp.basicclass15;

public class EncapsulationDemoMAin {
	
	public static void main(String[] args) {
		
		EncapsulationDemo demo = new EncapsulationDemo();
		demo.setGender("Male");
		String upendra = demo.getGender();
		
		System.out.println("Gender : "+upendra);
	}

}