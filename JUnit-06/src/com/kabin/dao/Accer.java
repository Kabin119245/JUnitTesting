package com.kabin.dao;

public class Accer implements Computer {
	
	@Override
	public boolean computerPurchased() {
		System.out.println("Accer Computer Purchased");
		
		return true;
	}

}
