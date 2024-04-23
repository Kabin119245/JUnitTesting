package com.kabin.dao;

public class Dell implements Computer {

	@Override
	public boolean computerPurchased() {
		System.out.println("Dell computer purchased");
		return true;
	}
	
}
