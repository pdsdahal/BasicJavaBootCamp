package com.bootcamp.basicclass19;

public class SingleChild extends SingleParent {
	
	private int childAge;
	private String childName;
	
	public SingleChild(int childAge, String childName) {
		this.childAge = childAge;
		this.childName = childName;
	}

	public void showChild() {
		System.out.println("Child Name : "+childName);
		System.out.println("Child Age : "+childAge);
		System.out.println("Child Address : "+super.address);
	}
	
	public void showFamilyDetails() {
		super.showParent();
		showChild();
	}
	
	public static void main(String[] args) {
		
		SingleChild child = new SingleChild(11, "Ram Panday");
		child.setParent(40, "Hari Panday", "Kathmandu Nepal");
		
		child.showFamilyDetails();
	}

}
