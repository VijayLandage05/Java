package com.interviewquestions.main;

import java.util.Scanner;

public class CountTheNumberOfCharactersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);         //for user input

		System.out.println("Enter the String : ");
		String str = sc.nextLine();                  //store the string entered by user

		System.out.println("Given string is : "+str);
		int count = 0;                               // initialize count to zero at start

		for(int i=0; i<str.length(); i++) {          // for loop for iteration
			if(str.charAt(i) != ' ' && str.charAt(i) != ',') {       // to eliminate space and comma from counting
				count ++;
			}
		}
		System.out.println("Number of characters in the given string is : "+count);
	}
}
