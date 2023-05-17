package com.bootcamp.basicclass12;

public class StringComparisionDemo {
	
	public static void main(String[] args) {
		
		String actualCollegeName = "Texas International College";
		String expectedCollegeName =  "Texas International College";
		
		
		boolean result = actualCollegeName.equals(expectedCollegeName);
		System.out.println("Using Equals : "+result);
		
		
		boolean result1 =  actualCollegeName.equalsIgnoreCase(expectedCollegeName);
		System.out.println("Using equalsIgnoreCase : "+result1);
		
		
		boolean result2 = actualCollegeName == expectedCollegeName;
		System.out.println("Using == "+result2);
		
		
		String actualAddress = "Kathmandu";//9
		String expectedAddress = "KathmaNdU";//15
		
		int data1 = actualAddress.compareTo(expectedAddress);
		System.out.println("Result : "+data1);
		
		//9 (A) < 15(E) -- negative integer number = 9-15 = -6 
		
		// l1 < l2 = - negative number (l1-l2)
		// l1 > l2 = + positive integer number  (l1-l2)
		// l1 == l2 = 0 (Both String are equals) (l1==l2)
		
		
		
		
		
	}

}
