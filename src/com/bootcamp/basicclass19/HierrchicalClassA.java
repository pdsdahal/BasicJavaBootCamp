package com.bootcamp.basicclass19;

public class HierrchicalClassA {
	
	private int l;
	private int b;
	private int r;
	
	
	public void setVariables(int l, int b, int r) {
		this.l = l;
		this.b= b;
		this.r = r;
	}
	
	
	public double findAreaOfCircle() {
		double rd = r;
		double area = (3.15)*rd*rd;
		return area;
	}
	
	
	public double findAreaRect() {
		return l*b;
	}

}
