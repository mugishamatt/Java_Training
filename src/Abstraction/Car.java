package Abstraction;

public class Car extends Vehicle {
	
	String color;
	//constructor
	Car(String brand, int year,String color ) {
		super(brand, year);
		this.color=color;
	}
	//implemementation of abstract methods

	@Override
	void start() {
		
		System.out.println("car start ----abstract method");
	}

	@Override
	void stop() {
		
		System.out.println("car stop ----abstract method");
		
	}
	//car specific method
	
	
	void showInfo() {
		System.out.println("the car is "+ this.brand + this.color + this.year);
		
		
	}

}
