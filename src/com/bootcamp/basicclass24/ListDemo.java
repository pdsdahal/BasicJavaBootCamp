package com.bootcamp.basicclass24;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		//List<String> lstStudentName = new ArrayList<String>();
		
		List<String> lstStudentName = new LinkedList<String>();
		
		lstStudentName.add("Ram Panday");
		lstStudentName.add("Sita Dahal");
		lstStudentName.add("Upendra Panday");
		lstStudentName.add("Shyam Shrestha");
		
		
		System.out.println("Initial Size : "+lstStudentName.size());
		
		lstStudentName.remove(0);
		System.out.println("Final Size : "+lstStudentName.size());
		
		//access the elements
		
		for(int i=0;i<lstStudentName.size();i++) {
			String studentName = lstStudentName.get(i);
			System.out.println("index : "+i + " , Name : "+studentName);
		}
		
		boolean flagCheck = lstStudentName.contains("Upendra ");
		System.out.println("check : "+flagCheck);
		
		
		Object[] arrayStudetns = lstStudentName.toArray();
		
		for(Object obj : arrayStudetns) {
			System.out.println(obj.toString());
		}
		
	}

}
