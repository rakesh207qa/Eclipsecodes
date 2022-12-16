package com.automation.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("program starting");
		int a = 5;
		int b =0;
		
		
		try { 
			int c1= a/b;	
		}catch(ArithmeticException e) {;
			System.out.println(e.toString());
			throw e;
		}finally{
			System.out.println("finally block");
		}
		
		System.out.println( "program ending");
	
		
		

		
		
		

	}

}
