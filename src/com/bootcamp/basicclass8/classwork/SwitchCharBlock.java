package com.bootcamp.basicclass8.classwork;

public class SwitchCharBlock {

	public static void main(String[] args) {

		String data = "UAT";

		switch (data) {

		case "PROD":// data==a
			break;

		case "UAT":// data ==b
			System.out.println("UAT environment");
			break;

		case "TEST":
			break;
			

		default:
			System.out.println("Put Dev configuration");

		}
		
		
	}

}
