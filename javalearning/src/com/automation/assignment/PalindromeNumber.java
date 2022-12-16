package com.automation.assignment;

public class PalindromeNumber {
	
	public static void Palindrome(int num) {
		System.out.println("Given number is:"+num);
		int r = 0;
		int sum = 0;
		int t;
		
		t=num;
		
		while (num>0) {
			r = num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
			
	}

	public static void main(String[] args) {
		
		Palindrome(151);
		Palindrome(263);
		
		
		

	}

}
