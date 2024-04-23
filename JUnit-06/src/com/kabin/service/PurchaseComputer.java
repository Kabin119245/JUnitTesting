package com.kabin.service;

import com.kabin.dao.Computer;

public class PurchaseComputer {
	
	public boolean proceedWithComputer(Computer comp) {
		//if dell object is passed, computerPurchased  method of Dell will be called similarly for other brands
			
		return comp.computerPurchased();
		
	}
	
}
