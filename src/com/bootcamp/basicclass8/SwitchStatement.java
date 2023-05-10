package com.bootcamp.basicclass8;

public class SwitchStatement {

	public static void main(String[] args) {

		int num = 3;

		switch (num) {

		case 1:// num == 1
			System.out.println("Case 1 : "+num);
			break;

		case 2:// num1 ==2
			System.out.println("Case 2 : "+num);
			break;

		case 3: // num3 ==3
			System.out.println("Case 3 : "+num);
			break;
			
		case 4:
			System.out.println("Case 4 : "+num);
			break;

		default:
			System.out.println("Case default : "+num);
		
		}
	}
}
