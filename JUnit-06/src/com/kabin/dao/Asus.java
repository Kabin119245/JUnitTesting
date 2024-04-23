package com.kabin.dao;

public class Asus implements Computer {
	
	@Override
	public boolean computerPurchased() {
		System.out.println("Asus computer purchased");
		return true;
	}

}
