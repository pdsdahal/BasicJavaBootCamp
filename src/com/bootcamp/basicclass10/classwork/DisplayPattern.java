package com.bootcamp.basicclass10.classwork;

public class DisplayPattern {

	public static void main(String[] args) {
		
		//row
		
		int column;
		int row;
		for(row=1;row<=5;row++) {
			
			//row =2 : 1 to 2, 1<=2
			//row= 3 : 1 to 3, 1<=3, 2<=3, 3<=3,4<=3
			
			for(column=1;column<=row;column++) {// 1<=1
				System.out.print(column+" ");
			}
			System.out.println("\n");
		}
		
		
	
		/*
		
		1
		1 2
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
		
		*/
		
	}
}
