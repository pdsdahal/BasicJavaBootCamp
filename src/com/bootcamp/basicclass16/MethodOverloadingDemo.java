package com.bootcamp.basicclass16;

public class MethodOverloadingDemo {

	public void taskFirst(int price) {
		System.out.println("From taskFirst method ");
		System.out.println("Price "+price);
	}

	public void taskFirst(int price, int tax) {
		System.out.println("From taskFirst method with a parameters");
		System.out.println("Int Price "+price);
		System.out.println("Tax : "+tax);

	}

	public void taskFirst(String price, int tax) {
		System.out.println("From taskFirst method with a parameters");
		System.out.println("double Price "+price);
		System.out.println("Tax : "+tax);
	}

	public int taskSecond(String name) {
		
		return 0;

	}

	public double taskSecond(int age) {

		return 0.0;
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.taskFirst(120);
		demo.taskFirst("145.0", 10);
	}
}
