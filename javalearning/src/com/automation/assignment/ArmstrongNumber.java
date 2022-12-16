package com.automation.assignment;

public class ArmstrongNumber {
	
	public static void Armstrongnumber(int num) {
		System.out.println("Given number is:"+num);
		
		int r =0;
		int sum =0;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
		}
		
		if (t==sum) {
			System.out.println("the number armstrong");
		}
		else {
			System.out.println("the number is not a armstrong");
		}
			
	}

	public static void main(String[] args) {
		
		Armstrongnumber(153);
		Armstrongnumber(236);
		
	}

}
