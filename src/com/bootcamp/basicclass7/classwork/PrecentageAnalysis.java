package com.bootcamp.basicclass7.classwork;

public class PrecentageAnalysis {
	
	public static void main(String[] args) {
		
		double percentage = 31;
		
		if(percentage >=32 && percentage < 35) {
			System.out.println("Pass");
		}else if(percentage >=35 && percentage < 40) {
			System.out.println("Third Div..");
		}else if(percentage >= 40 && percentage <45) {
			System.out.println("Second Div");
		}else if(percentage >= 45 && percentage < 60) {
			System.out.println("First Div");
		}else if(percentage >= 60) {
			System.out.println("Dist");
		}else {
			System.out.println("You are fail..");
		}
		
		
		/*
		<32 % - Failed
		32% to 35% - Passed
		
		>=35% to < 40% - third div
		
		>= 40% to <45% - second div
		
		>=45% to <60% - first
		>60% -- dis
		
		*/
		
		
	}

}
