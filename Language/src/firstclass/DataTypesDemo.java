package firstclass;

public class DataTypesDemo {
	

	public static void main(String[] args) {
		
		/*
		 * There are 2 types of data in java
		 * 1. Primitive datatype
		 * 2. Non-Primitive data type
		 * 
		 * Lets first see what is Primitive data type.
		 * There are total 8 type of primitive data type
		 * byte, short, int, long
		 * float, double
		 * char, boolean
		 * 
		 * Whenever we assign a floating point value to a variable then the java assumes that it is in double
		 */
		
		byte b1 = 10;
		System.out.println("This is byte b1 value "+ b1);
		short s = 11;
		System.out.println("This is short s value "+ s);
		int i =12;
		System.out.println("This is int i value "+ i);
		long l = 14;
		System.out.println("This is long l value "+ l);
		
		
		float f = 3.14f;      //why f is used here? because whenever a floating point gets declare 
		//inside java it assumes that its a double thats why we have to declare the f
		
		System.out.println("This isfloat f value "+ f);
		double d = 3.5;
		System.out.println("This is double d value "+ d);
		
		char c = 'M'; // Anything which you see on your keyboard is character.
		System.out.println("This is char c value "+ c);
		boolean isWeekend = true;	
		System.out.println("This is boolean isweekend value "+ isWeekend);
		
	}
	
	
	public void booleanex() {
		
		
		//boolean b = yes; //it is asking to declear yes as a local variable.
		
		//boolean b1 = TRUE; // its asking to create constant.
		
		
		
		
		//boolean b = 0;  its giving error while trying declear it with 0 or 1	
		
		
	}

}
