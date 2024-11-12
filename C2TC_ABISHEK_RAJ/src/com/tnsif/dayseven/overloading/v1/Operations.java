//Program to define overloaded methods for Palindrome checking
package com.tnsif.dayseven.overloading.v1;

public class Operations {
	
	//check whether number is Palindrome or not?
	public static boolean isPalindrome(int n)
	{
		int rev=0;
		int dn =n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return dn==rev;
	}

	//check whether string is Palindrome or not?
	public static boolean isPalindrome(String str)
	{
		String rev;
		rev=new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
}
