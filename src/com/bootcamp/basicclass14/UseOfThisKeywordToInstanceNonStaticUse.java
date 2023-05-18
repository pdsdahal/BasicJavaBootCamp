package com.bootcamp.basicclass14;

public class UseOfThisKeywordToInstanceNonStaticUse {

	public static void main(String[] args) {
		
		UseOfThisKeywordToInstanceNonStatic objRam = new UseOfThisKeywordToInstanceNonStatic();
		objRam.setAttributes(13, "Shyam Shrestha", 345678);
		
		objRam.showAttributesValues("USA");
	}
}
