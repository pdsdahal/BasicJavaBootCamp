package com.bootcamp.basicclass11;

public class ContinueDemo {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<10;i++) {
	
			if(i%2 != 0) {
				continue;
			}
			
			System.out.println("Value of i "+i);
			
		}
		
	}

}
