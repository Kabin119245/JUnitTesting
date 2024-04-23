package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sortingArrayTest {

	@Test
	void testsortingArray() {
		
		SortingArray sp = new SortingArray();
		
		int nums[] = {3,9,1,0,-9};
		
		int expected[] = {-9,0,1,3,9};
		
		
		
		assertArrayEquals(expected, sp.sortingArray(nums));
		//printing results
		for (int m :sp.sortingArray(nums)) {
			System.out.println(m);
		}
		
	}

}
