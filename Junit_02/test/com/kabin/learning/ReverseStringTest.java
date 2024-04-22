package com.kabin.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
	
	
	@Test
	public void test() {
		ReverseString rs = new ReverseString();
		assertEquals("nibaK",rs.reverseString("Kabin"));
		
	}

}
