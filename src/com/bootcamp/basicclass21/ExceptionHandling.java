package com.bootcamp.basicclass21;

public class ExceptionHandling {

	public static void main(String[] args) {

		String phoneNuber = "Apple";

		try {
			int phoneNo = Integer.parseInt(phoneNuber);
			System.out.println(phoneNo);
		} catch (Exception e) {

		}

		int num1 = 10;
		int num2 = 0;
		int result = 0;

		try {
			System.out.println("Inside the try block...");
			result = num1 / num2;// 10/0

		} catch (Exception e) {

			System.out.println("Reason of Exception : " + e.getMessage());

			num2 = 2;
			result = num1 / num2;// 10/2
		} finally {
			System.out.println("Inside the finally code");
		}

		System.out.println("Result  :  " + result);

		System.out.println("OutSide the try catch block....");

		// try, catch
		// try , finally
		// try, catch, finally

	}

}
