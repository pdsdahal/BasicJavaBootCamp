package com.bootcamp.basicclass13;

import java.util.Arrays;

public class StringManipulationMethods {
	
	public static void main(String[] args) {
		
		//0,1,2,3,4
		
		//charAt
		String address = "Kathmandu Nepal";
		
		char charAtZero =  address.charAt(10);
		System.out.println("Char At 10 index : "+charAtZero);
	
		//concat
		String address1 = address.concat(" Om Shanti Chwok");
		System.out.println("Address 1 : "+address1);
		
		//contains
		boolean containsCheck =  address.contains("th");
		System.out.println("Contains Check : "+containsCheck);
		
		//toUpperCase
		String uppcaseResult =  address.toUpperCase();
		System.out.println("UpperCase : "+uppcaseResult);
		
		//toLowerCase
		String lowerCaseResult = address.toLowerCase();
		System.out.println("LowerCase : "+lowerCaseResult);
		
		//contentEquals
		boolean contentEqualsCheck =  address.contentEquals("Kathmandu");
		System.out.println("ContentEquals : "+contentEqualsCheck);
		
		//endsWith
		boolean endWithCheck = address.endsWith("al");
		System.out.println("EndWith : "+endWithCheck);
		
		//startsWith
		boolean startWithCheck = address.startsWith("Kat");
		System.out.println("Start With : "+startWithCheck);
		
		//replace
		String collegeName = "AhwKopa Engineering College";
		String replaceResult1 =  collegeName.replace("Engineering", "");
		System.out.println("Replace : "+replaceResult1);
		
		//indexOf
		int Kcheck =  collegeName.indexOf("K");
		System.out.println("Index of Mehod : "+Kcheck);
		
		//isEmpty
		String data = "Apple";
		boolean resultEmptyCheck =  data.isEmpty();
		System.out.println("is Empty Check : "+resultEmptyCheck);
		
		//length
		String employeeName = "Shyam Shrestha";
		int length =  employeeName.length();
		System.out.println("Length : "+length);
		
		String subEmployeeName = employeeName.substring(2, 4);
		System.out.println("2 to 4 "+subEmployeeName);
		
		//substring
		String inputData = "QA Automation";
		System.out.println(inputData.substring(3, 7));
		
		//split
		String description = "This,is,the,String,manulation,demo.";
		String[] descriptions =   description.split(",");
		System.out.println(Arrays.toString(descriptions));
		
		for(int i=0;i<descriptions.length;i++) {
			System.out.println("index : "+i+ " Value : "+descriptions[i]);
		}
		
		//toCharArray
		String feedback = "This is simple demo.";
		char[] feedbacks = feedback.toCharArray();
		
		System.out.println(Arrays.toString(feedbacks));
		
		int flag = 0;
		while(flag<length) {
			System.out.println("Index : "+flag + " Value : "+feedbacks[flag]);
			flag++;
		}
		
		//trim
		String input = " Ram Panday ";
		System.out.println(input.trim());
		
	}
	

}
