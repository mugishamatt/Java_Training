package Abstraction;

//need to impliment all  interface methods
public class BicycleImpl implements DrivableInterface{
	
	String brand;
	int speed;
	
	public BicycleImpl(String brand,int speed) {
		this.brand=brand;
		this.speed=speed;
		
	}

	@Override
	public void start() {
		System.out.println("Starting to pedal the bicycle.");
		
	}

	@Override
	public void Accelerate(int speed) {
		 this.speed += speed;
		// TODO Auto-generated method stub
		System.out.println("Pedaling. Current speed: " + this.speed + " mph");
	}

	@Override
	public void brake() {
		 this.speed = 0;
	      System.out.println("Applying brakes."); 
	     
	    }
		
	

}
