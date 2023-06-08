package com.bootcamp.basicclass26.assignmentwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public void showList(List<Object> datas) {

		int size = datas.size();
		System.out.println("Size of list : " + size);
	}

	public static void main(String[] args) {

		int age = 16;

		List<Object> lstData = new LinkedList<>();
		lstData.add("Apple");
		lstData.add(1234);
		lstData.add(true);
		lstData.add(3456.789);

		ListDemo demo = new ListDemo();
		demo.showList(lstData);

		String sentence = "This is a boy. Address is";
		String[] datas = sentence.split(" ");

		int max = 0;
		String maxData = null;

		for (int i = 0; i < datas.length; i++) {
			String data = datas[i];
			int lenght = data.length();

			if (max < lenght) {
				max = lenght;
				maxData = data;
			}
		}
		
		System.out.println("Data : " + maxData + " Length : " + max);

	}

}
