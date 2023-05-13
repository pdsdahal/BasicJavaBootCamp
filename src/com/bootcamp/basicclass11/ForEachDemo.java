package com.bootcamp.basicclass11;

public class ForEachDemo {

	public static void main(String[] args) {

		// integer array
		int[] nums = { 10, 20, 30 };

		
		int sum = 0;
		for (int data : nums) {
			sum = sum + data;
		}

		System.out.println("Sum of nums is : " + sum);

		// String array
		String[] employees = { "Ram Panday", "Shyam Shrestha", "Sita Poudel" };
		
		for(String employee : employees) {
			System.out.println("Name : "+employee +" Length : "+employee.length());
		}
		
		
		
		// char array
		char[] charsArray = { 'a', 'b', 'c', '1', '2' };
		
		for(char data : charsArray) {
			System.out.println(data);
		}
		
		

		//double array
		double[] salarys = { 1234.56, 5667, 890, 6 };
		
		for(double salary : salarys) {
			System.out.println(salary);
		}
		

	}
}
