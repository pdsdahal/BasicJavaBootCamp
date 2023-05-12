package com.bootcamp.basicclass10;

public class ForLoopDemo {

	public static void main(String[] args) {

		// for(ini ; condition; increment/decrement )

		// increment
		System.out.println("Increment for loop\n");
		for (int i = 0; i < 10; i++) {// i=0, 0<10, i=0+1 = 1, 1<10, i=1+1=2, 2<10
			System.out.println(i);
		}

		// decrement

		System.out.println("Deceremtn for loop\n");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

	}

}
