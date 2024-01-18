package Abstraction;

public class MainDrivableInt {
	public static void main(String[] args) {
		
		
		BicycleImpl bike1=new BicycleImpl("lux", 12);
		
		bike1.Accelerate(20);
		bike1.brake();
	}

}
