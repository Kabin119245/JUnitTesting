package com.kabin.dao;


public class Hp implements Computer {

	@Override
	public boolean computerPurchased() {
		System.out.println("Hp computer purchased");
		return true;
	}
	
}
