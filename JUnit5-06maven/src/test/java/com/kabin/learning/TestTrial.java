package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	
	Shapes sh = new Shapes();

	@Test
	void test() {
		assertEquals(6,3+3);
	}
	@Test
	void testcomputeSquareArea() {
		assertEquals(36, sh.computeSquareArea(6));
		
		
	}
	
	

}
