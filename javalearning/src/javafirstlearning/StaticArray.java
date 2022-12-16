package javafirstlearning;

public class StaticArray {

	public static void main(String[] args) {
		int i[] = new int [6];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		i[5]=60;
		
		System.out.println(i[5]);
		System.out.println(i[0]);
		System.out.println("start new");
		
		//to print all values in i----use for loop method
		
		
		for (int k=0;k<i.length;k++) {
		System.out.println(i[k]);
		
		//double array
		
		
		
		
	}
		//double array
		
		double v[]= new double[2];
		v[0]=12.33;
		v[1]=33.66;
		System.out.println(v[0]);
		System.out.println(v[1]);
		
		
		//char array
		
		char n[]=new char[3];
		n[0]='r';
		n [1]='e';
		n[2]='l';
		System.out.println(n[1]);
		
		//print all the values in char
		
		for (char m=0;m<n.length;m++) {
			System.out.println(n[m]);
			System.out.println("boolean");
		}
		
		
		//boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		
		//string array
		
	String s[]=new String[2];
	s[0]="FATHER ";
	s[1]="mother";
	System.out.print(s[0]);
	System.out.println(s[1]);
	
	//disadvantages of static array
	//1.size is fixed 
	//2.stores only similar data types
	
	
		
	
		
		
		

	}
	}
