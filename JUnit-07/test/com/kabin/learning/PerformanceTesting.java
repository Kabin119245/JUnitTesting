package com.kabin.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class PerformanceTesting {
	//if we are using Junit4 then
	//@Test(timeout=100)
	@Test
	void testSortingLargeArray_Performance() {
		
		SortingLargeArray sla = new SortingLargeArray();
		int unsorted[] = {5,6,0,-99,-1,2};
		
		sla.sortingLargeArray(unsorted);
		
		assertTimeout(Duration.ofMillis(10), () -> sla.sortingLargeArray(unsorted));
		
	}

}
