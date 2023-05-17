package com.bootcamp.basicclass12.assignmentwork;

public class AssignentNo16QNo3 {
	
	
	public static int totalVowelCount(String input) {
		int count = 0;
		
		input  = input.toLowerCase();
		
		char[] datas =  input.toCharArray();
		for(char data : datas) {
			if(data == 'a' || data == 'e' || data == 'i' || data== 'o' || data=='u') {
				count = count+1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		
		String[] datas = {"Ram", "Shyam","Hari","Gopal","Apple"};
		

		/*
		Ram - 1 {r, a, m}
		Shyam - 1
		Hari - 2
		Gopal  - 2
		Apple - 2
	*/	
		
		for(String data : datas) {
			int vowelCount =  totalVowelCount(data);
			System.out.println("Input String : "+data + " Vowel Count : "+vowelCount);
		}
		
	}

}
