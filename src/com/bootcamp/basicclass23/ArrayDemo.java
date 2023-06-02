package com.bootcamp.basicclass23;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int num = 2;
		String name = "Ram Panday";
		
		//declare 
		int[] nums = {2,3,5,7,9,10,100};
		
		int index_0 = nums[0];
		int index_1 = nums[1];
		
		System.out.println("Index 0 : "+index_0);
		System.out.println("Index 1 : "+index_1);
		
		System.out.println("Size of array : "+nums.length);
		
		System.out.println("Using looping statment ");
		for(int i=0;i<nums.length;i++) {
			System.out.println("index : "+i+ " Value : "+nums[i]);
		}
		
		
		
		String[] names = {"Ram Panday","Shayam Shrestha","Sita Dahal"};
		String name_index_0 = names[0];
		
		System.out.println("Name in 0 : "+name_index_0);
		for(String name1 : names) {
			System.out.println(name1);
		}
		
		
		double[] salary = {2345.4567,5678.678};
		
		double salarys [] = {2345.4567,5678.678};
		
		//instantiate 
		
		System.out.println("Enter a size of array : ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] ages = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter a age");
			int age =  scanner.nextInt();//11, 12,13
			ages[i] = age;
		}
		
		
		//looping statement to fetch data from array
		int index = 0;
		while(index<size) {
			
			int ageValue = ages[index];
			System.out.println("Index : "+index + " Value : "+ageValue);
			
			index = index+1;
		}
		
	
		
		
		char[] gender = new char[50];
		
		
		
		
	}

}
