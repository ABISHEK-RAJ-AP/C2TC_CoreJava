//Program to demonstrate method overloading
package com.tnsif.dayseven.overloading.v1;

public class Executor {

	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+Operations.isPalindrome(1221));
		System.out.println("Is 123 Palindrome? "+Operations.isPalindrome(1234));
		
		System.out.println("Is CAR Palindrome? "+Operations.isPalindrome("MIAMI"));
		System.out.println("Is RACECAR Palindrome? "+Operations.isPalindrome("RACECAR"));

	}

}
