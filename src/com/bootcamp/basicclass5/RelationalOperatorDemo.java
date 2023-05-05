package com.bootcamp.basicclass5;

public class RelationalOperatorDemo {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = 30;

		boolean result1 = num1 == num2;// 20==20
		System.out.println(num1 + " == " + num2 + " : " + result1);

		boolean result2 = num1 > num2;// 20 > 20
		System.out.println(num1 + " > " + num2 + " : " + result2);

		boolean result3 = num1 < num2;// 30 < 20
		System.out.println(num1 + " < " + num2 + " : " + result3);

		boolean result4 = num1 >= num2;// 30 >= 30
		System.out.println(num1 + " >= " + num2 + " : " + result4);

		boolean result5 = num1 <= num2;// 30 <= 30
		System.out.println(num1 + " <= " + num2 + " : " + result5);

		boolean result6 = num1 != num2;// 40 == 30 = !false = true
		System.out.println(num1 + " != " + num2 + " : " + result6);
	}

}
