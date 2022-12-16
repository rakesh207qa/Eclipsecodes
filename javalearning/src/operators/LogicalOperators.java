package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b =15;
		System.out.println(a<b&b>a);
		System.out.println(a>b&b<a);
		System.out.println(a>b&b>a);
		System.out.println(a<b&b<a);
		
		
		int r = 6;
		int y =3;
		
		System.out.println(r>y||r<y);
		System.out.println(r>y||y<r);
		System.out.println(r<y||y>r);
		System.out.println(r>y||y>r);
		

	}

}
