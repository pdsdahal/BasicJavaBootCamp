package com.bootcamp.basicclass24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingList {
	
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<Integer>();
		ages.add(100);
		ages.add(20);
		ages.add(1000);
		ages.add(2);
		
	
		System.out.println("Index 0 before performaing any operation : "+ages.get(0));
		
		//sorting in ascending 
		
		Collections.sort(ages);
		
		System.out.println("Index 0 after performing ascending order : "+ages.get(0));
		System.out.println(ages);
		
		//descending 
		Collections.sort(ages, Collections.reverseOrder());
		System.out.println(ages);
		
		
		System.out.println("Index 0 after performing reverse order : "+ages.get(0));
				
	}

}
