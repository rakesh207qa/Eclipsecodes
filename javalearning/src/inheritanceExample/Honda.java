package inheritanceExample;

public class Honda extends Car{
    
	public void petrol() {
		System.out.println("petrol car");
	}
	
	public void sunroof() {
		System.out.println("sunroof car");
	}
	
	public static void main(String[] args) {
		
		
		Honda honda = new Honda();
		honda.start();
		honda.stop();
		honda.move();
		honda.petrol();
		
	}
}
