package com.bootcamp.basicclass14;

public class UseOfThisKeywordToInstanceStatic {
	
	private static int ages;
	private static String names;
	private static double salarys;
	
	public static void setAttributes(int age, String name, double salary) {
		ages = age;
		names = name;
		salarys = salary;
	}
	
	
	public static void showAttributesValues() {
		System.out.println("Name : "+names);
		System.out.println("Age : "+ages);
		System.out.println("Salary : "+salarys);
	}
	
	public static void main(String[] args) {
		
		UseOfThisKeywordToInstanceStatic thisdemo = new UseOfThisKeywordToInstanceStatic();
		thisdemo.setAttributes(11, "Ram Panday", 4567);
		
		thisdemo.showAttributesValues();
	}

}
