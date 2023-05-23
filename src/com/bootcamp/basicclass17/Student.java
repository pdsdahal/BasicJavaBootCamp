package com.bootcamp.basicclass17;

public class Student {
	
	public Student() {
		System.out.println("Inside the default constructor");
	}
	
	public Student(String name, String address, int age) {
		
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
	}
	
	
	public void showName(int id, String collgeName) {
		
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Ram Panday", "Kathmandu", 11);
		Student student2 = new Student("Shyam Shrestha", "Kathmandu Nepal", 13);
		
		Student student3 = new Student();
		
	}

}
