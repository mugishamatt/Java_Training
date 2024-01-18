package Abstraction;

public class Bicycle extends Vehicle {
	
	String color;
	

	Bicycle(String brand, int year,String color) {
		super(brand, year);
		this.color=color;
		
	}

	@Override
	void start() {
	
		System.out.println("motocycle starts");
	}

	@Override
	void stop() {
		
		System.out.println("motocycle stops");
	}
	//concret methods
	 void accelerate() {
		 System.out.println("bicycle accelerate in concret method");
	 }
	void showInfo() {
		System.out.println("the bicycle is "+ this.brand + this.color + this.year);
		
		
	}

}
