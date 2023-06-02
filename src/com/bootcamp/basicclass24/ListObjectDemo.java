package com.bootcamp.basicclass24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListObjectDemo {
	
	public static void main(String[] args) {
		
		List<Employee> lstEmployee = new Stack<Employee>();
		
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Ram Panday");
		e1.setEmplAddress("Kathmandu Nepal");
		e1.setEmpEmail("ram@gmail.com");
		
		Employee e2 = new Employee();
		e2.setEmpId(200);
		e2.setEmpName("Sita Panday");
		e2.setEmplAddress("Bhaktapur Nepal");
		e2.setEmpEmail("sita@gmail.com");
		
	
		lstEmployee.add(e1);
		lstEmployee.add(e2);
		
		
		for(int i=0;i<lstEmployee.size();i++) {
			Employee emp2 =  lstEmployee.get(i);
			System.out.println("Id : "+emp2.getEmpId());
			System.out.println("Name : "+emp2.getEmpName());
			System.out.println("Address : "+emp2.getEmplAddress());
			System.out.println("Email : "+emp2.getEmpEmail());
		}
		
		
		Object[] objs =  lstEmployee.toArray();
		
		System.out.println("Way to convert list to Array");
		for(Object obj : objs) {
			
			Employee employee = (Employee) obj;
			System.out.println("Id : "+employee.getEmpId());
			System.out.println("Name : "+employee.getEmpName());
			System.out.println("Address : "+employee.getEmplAddress());
			System.out.println("Email : "+employee.getEmpEmail());
			
		}
		
		
		
		
		
	}

}
