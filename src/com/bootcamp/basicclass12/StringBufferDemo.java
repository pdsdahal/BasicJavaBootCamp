package com.bootcamp.basicclass12;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		String mainThreadName =  Thread.currentThread().getName();
		System.out.println("Thread Name : "+mainThreadName);
		
		//110
		//100 concurrent at time
		
		StringBuffer buffer  = new StringBuffer();
		
		System.out.println("Using Buffer");
		
		buffer.append("Name : Ram Padnday\n").append("Age : 10\n").append("RollNo :  1");
		System.out.println(buffer.toString());
		
		
		StringBuilder builder = new StringBuilder();
		
		System.out.println("Using Builder");
		
		builder.append("Name : Ram Padnday\n");
		
		
		for(int i = 0;i<10;i++) {
			
		}
		
		builder.append("Age : 10\n").append("RollNo :  1");
		
		System.out.println(builder.toString());
		
		
	}

}
