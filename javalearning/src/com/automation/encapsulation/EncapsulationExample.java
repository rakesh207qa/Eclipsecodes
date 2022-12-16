package com.automation.encapsulation;

public class EncapsulationExample {

	private int ssn;
	private String carname;
	private double temp;
	
	public static void main(String[] args) {
		
EncapsulationExample enp = new EncapsulationExample();
      enp.setCarname("ciaz");
      enp.setSsn(123456);
      enp.setTemp(33.6);
      
      System.out.println("carname is "+enp.getCarname() );
      System.out.println("SSN is "+enp.getSsn());
      System.out.println("temparature is "+enp.getTemp());
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

}
