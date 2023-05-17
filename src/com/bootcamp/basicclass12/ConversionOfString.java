package com.bootcamp.basicclass12;

public class ConversionOfString {
	
	public static void main(String[] args) {
	
		//String to double 
		String phoneNo = "23456.0";
		double doublePhoneNo  = Double.parseDouble(phoneNo);
		System.out.println("String to double conversion : "+doublePhoneNo);
		
		String age = "13";
		int intAge = Integer.parseInt(age);
		System.out.println("String to Int conversion : "+intAge);
		
		
		String checkFlag = "true";
		boolean booleanCheckFlag = Boolean.parseBoolean(checkFlag);
		System.out.println("String to boolean conversion : "+booleanCheckFlag);
		
		
		Object data1 = "tyuiop";
		String objectToString =  data1.toString();
		System.out.println("Object to String : "+objectToString);
		
		
		int num1 = 10;
		Integer num11 = num1;
		
		String intToString1 =  num11.toString().concat(" Ram Panday");
		System.out.println(intToString1);
		
		
	}

}
