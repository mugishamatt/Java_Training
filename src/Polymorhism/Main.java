package Polymorhism;

public class Main {
public static void main(String[] args) {
	
	// method overloading
	Animal an=new Animal();
	an.makeNoise();
	
	Animal dg1=new Dog();
	dg1.makeNoise();
	//
	
	
	
	
	int res=an.add(4, 5);
	
System.out.println("solution" +res);
 

}
}
