package com.bootcamp.basicclass23;

public class ArrayClassWork1 {
	
	
	public void showData(int[] demoAge, String[] namesArr) {
		
		for(int i=0;i<demoAge.length;i++) {
			
			System.out.println("Index : "+i + " Data : "+namesArr[i] + " Length : "+demoAge[i]);
		}
	}

	public static void main(String[] args) {
		
		String[] names = {"Ram", "Shyam", "Hari", "Gopal"};
		
		int size = names.length;
		
		int[] lenghts = new int[size];
		
		for(int i=0;i<size;i++) {
			
			String name = names[i];
			int length = name.length();
			lenghts[i] = length;
		}
		
		ArrayClassWork1 demo = new ArrayClassWork1();
		demo.showData(lenghts, names);
		
		/*System.out.println("String Array : "+Arrays.toString(names));
		System.out.println("Int Array : "+Arrays.toString(lenghts));
		*/
		
	}
}
