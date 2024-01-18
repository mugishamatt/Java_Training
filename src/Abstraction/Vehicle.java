package Abstraction;

public abstract class Vehicle {
	
	String brand;
	int year;
	//constructor
	Vehicle(String brand,int year){
		
		this.brand=brand;
		this.year=year;
		
	}

	//abstract method
	
	abstract void start();
	abstract void stop();
	
	//concret method
	
	
	 void accelerate() {
		 System.out.println("vehicle  accelerate in concret method");
	 }
	
}
