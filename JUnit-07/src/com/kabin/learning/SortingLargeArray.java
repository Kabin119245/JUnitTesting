package com.kabin.learning;

import java.util.Arrays;

public class SortingLargeArray {

	public int[] sortingLargeArray(int[] array) {

		for (int i = 0; i < 100000; i++) {

			Arrays.sort(array);
		}

		return array;
	}

}
