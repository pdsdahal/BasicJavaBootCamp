package com.bootcamp.basicclass25;

import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		//key, value
		Map<String, String> map =  new WeakHashMap<String, String>();
		
		//store the data in map
		map.put("Ram", "Kathmandu Nepal");
		map.put("Shyam", "Baneshowr");
		map.put("Sita", "Kathmandu");
		
		//access the data from map
		String valueRam = map.get("Ram");
		System.out.println("Ram : "+valueRam);
		
		//display all data
		
		System.out.println(map);
		
		//display all data -- first way
		
		System.out.println("using entrySet");
		for(Entry<String, String> data : map.entrySet()) {
			
			String keyName = data.getKey();
			String keyValue =  data.getValue();
			System.out.println("Key : "+keyName + " Value : "+keyValue);
		}
		
		
		
		
		//key, value
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("A", 12345);
		map2.put("B", 12345);
		map2.put("C", 3456);
		map2.put("D", 86764);
		
		System.out.println(map2);
		
		//way second
		
		System.out.println("Using keySet");
		for(String keyName : map2.keySet()) {
			Integer keyValue = map2.get(keyName);
			System.out.println("Key : "+keyName + " Value : "+keyValue);
		}
		
		
		int beforeSizeMap = map2.size();
		
		map2.remove("D");
		
		int afterRemovesizeMap = map2.size();
		
		
		System.out.println("Before Remove Size is : "+beforeSizeMap);
		System.out.println("After Remove Size is : "+afterRemovesizeMap);
		
		
		//third way
		System.out.println("Using iterator");
		
		Iterator<Map.Entry<String, Integer>> iterator =  map2.entrySet().iterator();
		while(iterator.hasNext()) {
			
			Entry<String, Integer> data =  iterator.next();
			String keyName = data.getKey();
			Integer keyValue =  data.getValue();
			System.out.println("Key : "+keyName + " Value : "+keyValue);
			
		}
		
		//Array List
		
		List<Double> lstSalary = new ArrayList<>();
		lstSalary.add(4567.5678);
		lstSalary.add(6789.5678);
		lstSalary.add(09876.5678);
		lstSalary.add(4567.5678);
		
	 	Iterator<Double> iterator2 =  lstSalary.iterator();
		
		while(iterator2.hasNext()) {
			Double salary =  iterator2.next();
			System.out.println("Salary : "+salary);
		}
		
		
		
		
	}

}
