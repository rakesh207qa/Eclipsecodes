package com.automation.assignment;

public class StringMethods {

	public static void main(String[] args) {
	String s = "i have a plan";
	String k = "this is my laptop";
	String p ="my bike";
	String o ="my bike";
	String num ="123654789";
	String low = "MY LAPTOP";
	String cap = "my new bike";

	System.out.println(s.charAt(12));           /// n
	System.out.println(s.contains(s));          ///true
	System.out.println(k.contains(k));/// true
	System.out.println(s.contains(p));//false
	System.out.println(num.endsWith(num));//true
	System.out.println(num.endsWith(s));//false
	System.out.println(s.indexOf(s));//
	System.out.println(num.indexOf(p));
	System.out.println(p.intern()==o.intern());
	System.out.println(s.isEmpty());
	System.out.println(o.length());
	System.out.println(o.replaceAll(p, num));
	System.out.println(s.replaceFirst(num, k));
	System.out.println(o.split(s));
	System.out.println(num.toCharArray());
	System.out.println(low.toLowerCase()+num);
	System.out.println(cap.toUpperCase()+low);
	System.out.println(o.split(s));
	System.out.println(s.toString());
	
	}

}
