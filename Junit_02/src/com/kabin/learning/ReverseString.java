package com.kabin.learning;

public class ReverseString {
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = charArray.length-1;
		
		while(start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			
			start ++;
			end--;
		}
		return new String(charArray);
		//again characters to string
	}
	
}
