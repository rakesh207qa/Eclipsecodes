package com.automation.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {
	
	

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10); //0
		al.add(20);  //1
		al.add("name");//2
		
		System.out.println(al.size()); // size of arraylist
		System.out.println(al.get(2)); // get the index value
		
		al.add(23);
		al.add(56);
		
		System.out.println(al.size());
		
		// to print all the values use for loop
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(85);
		al1.add(69);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("bike");
		al2.add("ciaz");
		
		//empolyee class object
		
		EmpolyeeData e1 = new EmpolyeeData("rakesh",23,"testing");
		EmpolyeeData e2 = new EmpolyeeData("bablu",24,"developer");
		EmpolyeeData e3 = new EmpolyeeData("sunny",25,"admin");
		
		// create arraylist
		
		ArrayList<EmpolyeeData> al3 = new ArrayList();
		al3.add(e1);
		al3.add(e2);
		al3.add(e3);
		for(EmpolyeeData emp: al3) {
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		//Itrator to traverse the values 
		Iterator<EmpolyeeData> it =al3.iterator();
		
		while(it.hasNext()){
		EmpolyeeData emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
			
			
		}
		

	}

}
