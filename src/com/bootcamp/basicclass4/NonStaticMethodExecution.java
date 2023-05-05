package com.bootcamp.basicclass4;

public class NonStaticMethodExecution {

	public static void main(String[] args) {
		
		//non static method
		MethodDeclaration declaration = new MethodDeclaration();
		declaration.addition();
		
		declaration.sum(300, 400);
		
		String info =  declaration.getInfo("Ram Panday", "Nepal");
		System.out.println(info);
		
	}
}
