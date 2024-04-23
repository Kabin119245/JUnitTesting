package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;
//learning if particular exception is generating exception or not

import org.junit.jupiter.api.Test;

class TestException {
	//no exception --> test case fails
	//exception --> test case passes

	@Test
	void testSortingArray_Exception() {
		
		try {
		SortingArray sa = new SortingArray();
		int unsortedArray[] = {12,9,0,23,-5,3};
		//int unsortedArray[] = null;
		
		
		
		int sortedArray[] = sa.sortingArray(unsortedArray);
		for(int m : sortedArray) {
			System.out.println(m);
		}
		fail();
		}
		catch(NullPointerException e) {
			System.out.println("Exception genrated, Dont pass NULL value");
		}
		
	}

}
