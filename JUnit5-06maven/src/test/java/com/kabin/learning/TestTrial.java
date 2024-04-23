package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	
	Shapes sh = new Shapes();

	
	@Test
	void testcomputeSquareArea() {
		assertEquals(36, sh.computeSquareArea(6),"Calculation of area is wrong");
		
		//we can do by implementation of Supplier interface where message will not be evaluated if the test is passes
		
	}
	
	@Test
	void testcomputeCircleArea_Supplier() {
		assertEquals(113.04, sh.computeCircleArea(6), () -> "Message to dev");
		//we can also use assertNotEquals which gives just opposite result of assertEquals
	}
	
	

}
