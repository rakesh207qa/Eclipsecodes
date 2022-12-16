package com.automation.assignment;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num =9;
		int count = 0;
		for (int i=1; i<=num;i++) {
			if (num % i ==0) {
				count++;
			}
			}
		System.out.println(count);
if (count==2) {
	System.out.println("prime");
	

}else {
	System.out.println("not prime");
}
 	}

}
