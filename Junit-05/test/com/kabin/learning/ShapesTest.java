package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes sh = new Shapes();

	@Test
	void testcomputeSquareArea() {
		
		assertEquals(36, sh.computeSquareArea(6));
	}
	
	@Test
	void testcomputeCircleArea() {
		
		assertEquals(113.04, sh.computeCircleArea(6));
	}

}
