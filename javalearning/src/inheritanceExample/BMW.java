package inheritanceExample;

public class BMW extends Car {
	 public void automatic() {
		 System.out.println("automatic");
	 }
	 
	 public void highspeed() {
		 System.out.println("highspeed");
	 }

	 public static void main(String[] args) {
		 
		 BMW bmw = new BMW();
		 bmw.automatic();
		 bmw.start();
		 bmw.start();
	 }
}

