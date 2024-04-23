package com.kabin.learning;

import java.util.Arrays;

public class SortingArray {
	//as we are learning exception, this method will take integer array as input and outputs the sorted array, but if null is passed then it will generate null pointer exception
	
	public int[] sortingArray(int[] array) {
//		Arrays.sort(array);
//		return array;
		
		for(int i=0; i < array.length;i++) {
			
			for(int j=i+1; j < array.length;j++) {
				
				int temp = 0;
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		
		return array;
		
	}

}
