package com.bootcamp.basicclass10.classwork;

public class OddCheckForLoop {

	public static void main(String[] args) {

		// check odd number from 20 to 100
		// 21, 23, 25

		int countOdd= 0 ;
		for (int i = 20; i <= 100; i=i+1) {		
		
			if(i%2 !=0) {
				countOdd = countOdd  +1;
			}
		}
		
		System.out.println("Odd number between 20 to 100 : "+countOdd);
	
		
		
	}

}
