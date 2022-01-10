package learn;

public class ConstructorDemo {
	
	
	
	/*
	 * Whenever an object is created an default constructor gets called.
	 * 
	 * And whenever an constructor is called inside class, then the default constructor doesn't get called. 
	 * 
	 * A consturctor has the same name as the class name and a constuctor excatly looks like a method except return type.
	 * 
	 */

	
	
	
	
	public ConstructorDemo(int a, int b) {
		
		int sum = a+b;
		System.out.println("Parametrized consrtuctor has been called " + sum);
		
	}
	
	
	
}
