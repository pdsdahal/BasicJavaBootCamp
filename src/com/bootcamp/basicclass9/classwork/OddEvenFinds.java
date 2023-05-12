package com.bootcamp.basicclass9.classwork;

public class OddEvenFinds {
	
	public static void main(String[] args) {
		
		
		int num = 1;
		int oddSum = 0;
		int evenSum = 0;
		
		while(num <= 5) {
			
		System.out.println("number : "+num);
			boolean evenCheck = num%2 == 0;
			
			
			if(evenCheck) {
				//System.out.println("this is a even number : "+num);
				evenSum = evenSum  + num;
			}else {
				//System.out.println("Odd number : "+num);
				
				oddSum = oddSum + num;
			}
			
			num++;
			
		}
		
		System.out.println("Even sum form 1 to 5 : "+evenSum);
		System.out.println("Odd sum form 1 to 5 : "+oddSum);
		
	}

}
