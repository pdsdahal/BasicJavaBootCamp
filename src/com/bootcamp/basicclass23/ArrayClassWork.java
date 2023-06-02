package com.bootcamp.basicclass23;

public class ArrayClassWork {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,4,67,34,100,99,3,1,101,23};
		
		int min = numbers[0];//10//4
		
		int max = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			int num = numbers[i];
			
			if(num < min) {//67 < 4
				min = num;
			}
			
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println("Min is : "+min);
		System.out.println("Max is : "+max);
		
		
	}

}
