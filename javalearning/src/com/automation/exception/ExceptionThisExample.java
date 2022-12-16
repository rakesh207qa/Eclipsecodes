package com.automation.exception;

public class ExceptionThisExample {

	int id;
	String name;
	double temp;

	
	
	
	
	public void userDetails(int id,String name,double temp) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(temp);
		
		this.id = 236;
		this.name="verna";
		this.temp=36;
		
		
	}
	public static void main(String[] args) {
		ExceptionThisExample eT = new ExceptionThisExample ();
		eT.userDetails(456, "ciaz",22);
		
		System.out.println(eT.id);
		System.out.println(eT.name);
		System.out.println(eT.temp);
		
		
	
	}
	
	
	
}
