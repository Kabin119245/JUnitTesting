package com.kabin.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTesting {

	@Test
	void testArrays() {
		//Actual and expected arrays are equal
		//1.number of elements should match
		//2.Elements of an array are equal
		//3.order of elements in an array should be same
		
		int expected[] = {2,4,6,8};
		int actual[] = {2,6,4,8};
		
		Arrays.sort(actual); //{2,4,6,8};
		
		assertArrayEquals(expected, actual); //test is passed
				
	}

}
