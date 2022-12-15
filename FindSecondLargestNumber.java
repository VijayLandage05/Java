package com.interviewquestions.main;

import java.util.Arrays;

public class FindSecondLargestNumber {
	public static void Print2Largest(int arr[]) {      // Create method and pass array as argument.
		if(arr.length < 2) {
			System.out.println("The array is insufficient to compare");
		}
		
		Arrays.sort(arr);  // At this point array will be sorted 10,20,20,40,50,70 
		
		for(int i = arr.length-1; i>=0; i--) {  // start from second last element from sorted array
			if(arr[i] != arr.length) {          // check if second last element is not equal with last element
				System.out.println("The second largest number in the given array is : "+arr[i]);
				return;
			}
		}
	}
	public static void main(String[] args) {
		int arr [] = {10,20,40,50,20,70};
		System.out.println("The given array is : "+Arrays.toString(arr));
		Print2Largest(arr);
	}
}
