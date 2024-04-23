package com.kabin.service;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kabin.dao.Hp;

class TestComputerPurchase {
	
	PurchaseComputer pc = new PurchaseComputer();
	
	@Test
	void testproceedWithComputer() {
		Hp hp = new Hp();
		boolean result = pc.proceedWithComputer(hp); // new Hp(); directly
		
		assertTrue(result);
		//in assertTrue(), if the value inside the parenthesis is true, test case passes
		//where as assertFalse() acts just opposite to assertTrue()
		result = false;
		//here result is made negative just for representation 
		assertFalse(result);
		
	}

}
