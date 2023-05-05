package com.bootcamp.basicclass5;

public class LogicalOperatorDemo {
	
	public static void main(String[] args) {
		
		int num1 =  60;
		int num2 = 20;
		int num3 = 40;
		
		//logical and operator
		boolean result1 =  (num1>num2) && (num1>num3);// 60>20 && 60>40 = true && true = true
		System.out.println(num1+" > "+num2 + " && "+num1+" > "+num3 + " : "+result1);
		
		
		boolean result2 =  (num1 <= num2) && (num2>num3);// 60 <= 20 && 20 > 40 = false && false = false
		System.out.println(num1+" <= "+num2 + " && "+num2+" > "+num3 + " : "+result2);
		
		
		//logical or
		boolean result3 =  (num1>num2) || (num1>num3);// 60>20 || 60>40 = true || true = true
		System.out.println(num1+" > "+num2 + " || "+num1+" > "+num3 + " : "+result3);
		
		boolean result4 =  (num1 >= num2) || (num2>num3);// 60 >= 20 || 20 > 40 = true  || false = true
		System.out.println(num1+" >= "+num2 + " || "+num2+" > "+num3 + " : "+result4);
		
		//logical not 
		boolean result5 =  !(num1>num2) || !(num1>num3);// 60>20 || 60>40 = !(true) || !(true) = false || false = false
		System.out.println("!("+num1+" > "+num2 + ") || !("+num1+" > "+num3 + ") : "+result5);
		
		
		
		int num4 = 5;
		int num5 = 3;
		int num6 = 4;
		int num7 = 4;
		
		boolean result6 = (num4 > num5) && (num6==num7) || (num4>num7);// (5 > 3) && (4==4) || (5 > 4) = (true && true) || true = true || true = true
		System.out.println("Result &&, || : "+result6);
		
		boolean result7 = (num4 > num5) && (num6==num7) && !(num4>num7);// (5 > 3) && (4==4) && (5 > 4) = (true && true) && !true = true && false = false
		System.out.println("Result &&, || , !: "+result7);
		
		
	}

}
