package sixthClass;

public class StringDemo {
	
	/*
	 * String is a Non-primitive data type and String is a final class in Java
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		
		
		String s= "Bipin";
		
		System.out.println(s.charAt(3)); //printing 3rd character of the string from the HME.(Home work exercise)
		System.out.println(s);
		/*
		 * Now i want to print Bipin singh, so i will have to add a string using some method. lets see below.
		 */
		
		
	 	s.concat("Singh");
		System.out.println(s);
		/*
		 * Here we can see that in memory still s = "Bipin" is pointing even after trying with concating with the method.
		 * 
		 * Now we have to learn what is final?
		 * Whenever you create an object of string or of final class object in Java that object can not be updated/modified in Java.
		 * If the keyword is Final class then the object can not be updated.
		 * 
		 * String class object cannot be modified.
		 * 
		 * and if you try to update the value then it will create an another object and provide the new value to the newly created object.
		 * 
		 *  Strings are immutable in Java i.e cann't be updated.
		 *  
		 *  To make it mutable there is another 2 classes.
		 *  
		 *  1. StringBuffer class
		 *  and 2. StringBuilder class
		 */
		
		String s1 = new String("Tanay");
		System.out.println(s1);
		s1.concat("Singh");
		System.out.println(s1.concat("Singh"));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		
	StringBuffer sb = new StringBuffer("Dilip");
	System.out.println(sb);
		
		System.out.println(sb.append("Singh"));
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		StringDemo s3 = new StringDemo();
		
		s3.reverseAString("Bipin");
		
		/* String Builder */
		StringBuilder sb1 = new StringBuilder("NK");
		System.out.println(sb1.append("Singh"));
		System.out.println(sb1.reverse());
		System.out.println(sb1.length());
		
		
		
		
		//Threading Concept:
		/*
		 * There are 2 types of thread
		 * 1 Single thread - This is thread safe, safer compared to MT.
		 * 2. Multi thread. - It is fast.
		 * 
		 * StringBuffer is thread safe
		 */
		
		
		
	}
	
	public void reverseAString(String str) {
		/*
		 * Own logic
		 */
		
		for(int i=str.length()-1;i<=1; i--) {
			System.out.println(str.charAt(i));
		}
		
		
	}
	
	
	
	
	
	
}
