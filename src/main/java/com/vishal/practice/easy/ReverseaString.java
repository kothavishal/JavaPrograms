package com.vishal.practice.easy;

public class ReverseaString {

	public static void main(String[] args) {

	}

	/**
	 * O(N/2)
	 */
	static void reverse(String s) {
		char[] arr = s.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}

	
	static void reverse(char [] arr) {		
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
	
	static void reverse(char [] arr, int st, int en) {		
		int i = st;
		int j = en;
		while (i < j) {
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}
