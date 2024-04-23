package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString rev = new ReverseString();

	@Test
	void testReverseString_OneWord() {

		assertEquals("lapeN", rev.reverseString("Nepal"));

	}

	@Test
	void testReverseString_MultipleWords() {

		assertEquals("yrtnuoc ym si lapeN", rev.reverseString("Nepal is my country"));

	}

}
