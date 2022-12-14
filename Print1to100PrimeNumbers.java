package com.interviewquestions.main;

public class Print1to100PrimeNumbers {

	public static boolean isPrime(int n) {
		if(n<2) {                            // if number less than 2 then it is not prime number
			return false;
		}
		for(int i = 2; i<=n/2; i++) {        // start from 2 and check for n/2 
			if(n%i == 0) {                   // check if remainder is zero then it number is divisible
				return false;
			}
		}
		return true;                         // if not divisible return true
	}

	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 to 100 are : ");
		for(int i=1; i<=100; i++) {          // for loop to print 1 to 100 numbers
			if(isPrime(i)) {
				System.out.print(i+",");
			}
		}
	}
}