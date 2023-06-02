package com.bootcamp.basicclass22;

public class ThrowsDemo {

	public void div(int num1, int num2) throws ArithmeticException, NullPointerException, IllegalArgumentException {

		int div = num1 / num2;
		System.out.println("Div is : " + div);
	}

	public static void main(String[] args) {

		ThrowsDemo demo = new ThrowsDemo();

		try {
			demo.div(10, 0);
		} catch (ArithmeticException | NullPointerException e ) {
			System.out.println("Reason : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argu : " + e.getMessage());
		}
	}

}
