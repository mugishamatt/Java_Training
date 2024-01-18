package inheritance;

public class Person {

	
	String name;
	int age;
	

	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	   void display() {
	        System.out.println("Hello " + this.name + ", you're " + this.age + " years old.");
	    }
	
	
}
