package com.bootcamp.basicclass20;

public interface InterfaceDemo {

	public String brwserNameChrome = "Chrome";
	public String brwserNameEdge = "Edge";
	public String seeniumVersion  = "1.67";
	
	
	public void add(int num1, int num2);
	public int sub(int num1, int num2);
	public double div(double num1, double num2);
	public String getResults(String name);
	
	//browser mentioned
	public void setUpBrowser();
	//url 
	public void lunchURL();
	
	public void shutDown();

}
