package Abstraction;

public class MainAbstarct {

	public static void main(String[] args) {
		
		
		
		//cannot make object of absract class
		
		
		
		Car ford=new Car("ford", 2000, "red");
		
		ford.showInfo();
		ford.accelerate();// concret not abstract in Parent class
		
		Bicycle bike= new Bicycle("matabaro", 1990, "yellow");
		
		bike.accelerate();
		bike.showInfo();
		bike.start();

	}

}
