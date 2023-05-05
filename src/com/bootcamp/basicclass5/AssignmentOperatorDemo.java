package com.bootcamp.basicclass5;

public class AssignmentOperatorDemo {
	
	
	public void muliAndAssignment(int num1, int num2) {
		num1 *= num2; // num1 = num1*num2
		System.out.println("*= : "+num1);
	}
	
	public static void divAndAssignment(int num1, int num2) {
		num1 /= num2; // num1 = num1/num2
		System.out.println("/= : "+num1);
	}
	
	public static void main(String[] args) {
		
		//simple assignment operator
		String name = "Ram Panday";
		int rollNo = 12;
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollNo);
		
		//+= add and assignment operator
		
		int num1 = 20;
		int num2 = 30;
		
		num2 += num1; // num2 = num2+num1  = 30+20
		System.out.println("+= : "+num2);
		
		//sub and assignment operator -=
		num2 -= num1;// num2 = num2-num1 = 50-20 = 30
		System.out.println("-= : "+num2);
		
		
		AssignmentOperatorDemo demo = new AssignmentOperatorDemo();
		demo.muliAndAssignment(num1, num2);//20,30
		
		
		AssignmentOperatorDemo.divAndAssignment(20, 5);//20,30
		
		
		
	}

}
