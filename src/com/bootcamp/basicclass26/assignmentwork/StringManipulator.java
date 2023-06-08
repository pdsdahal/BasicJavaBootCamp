package com.bootcamp.basicclass26.assignmentwork;

public class StringManipulator {
	
	
	public int countOccurrences(String str, char ch) {
		int length = str.length();
		int countChar = 0;
		for(int i=0;i<length;i++) {
			
			char charAtIndex =  str.charAt(i);
			
			if(charAtIndex == ch) {
				countChar  = countChar + 1;
			}
			
		}
		return countChar;
	}
	
	public int countOccurrences(String str, String substring) {
		
		int countWord = 0;
		int startIndex = 0;
		int endIndex = 0;
		
		startIndex = str.indexOf(substring, startIndex);
		endIndex = startIndex + substring.length();
		
		System.out.println("Start Index : "+startIndex);
		System.out.println("Ed Index : "+endIndex);
		
		String data = str.substring(startIndex, endIndex);
	
		if(data.equals(substring)) {
			countWord = countWord + 1;
		}
		
		
		
		return countWord;
	}
	
	public static void main(String[] args) {
		
		String data = "Apple Ball Cat Apple";
		char input = 'p';
		
		StringManipulator obj = new StringManipulator();
		int resultOcuurrences  = obj.countOccurrences(data, input);
		
		System.out.println("Result of character occurences : "+resultOcuurrences);
		
		
		String subString = "ll Cat Apple";
		int resultWordOccurance = obj.countOccurrences(data, subString);
		System.out.println("Word Occurance : "+resultWordOccurance);
		
	}

}
