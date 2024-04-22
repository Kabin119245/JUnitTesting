package com.kabin.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		
		Calc c = new Calc();
		int actual = c.multiply(10, 2);
		int expectedResult = 20;
		assertEquals(expectedResult, actual);
		//expected result, method generated result
	}

}
