package com.bootcamp.basicclass12;

public class StringDemoDiscussion {

	public static void main(String[] args) {
		
		//primitive type
		char data = 'a';
		char data2 = 'b';
		
		//non primitive type
		String data3 = "ab";
		data3 =  data3.concat("cd");//abcd
		//abcd
		System.out.println(data3);
		
		
		//ways to declare the string 
		//1. by using literal 
		String collegeName = "Texas International College";
		System.out.println("CollegeName : "+collegeName);
		
		//1. by creating a String instance 
		String address = new String("Kathmandu Nepal");
		System.out.println("Address : "+address);
		
		
		
	}
}
