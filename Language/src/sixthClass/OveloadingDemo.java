package sixthClass;

public class OveloadingDemo {
	/*
	 * Overloading:
	 * Same method name with different signature.
	 * Can be achieved using 2 ways.
	 * 1. Same method names By different number of argument
	 * 2. Same method name with same number of argument but with different data type.
	 * 
	 * 
	 * lets see the example below and example will be 
	 * we have to create an method which can add up to 2,3,4,5 and so on number
	 * so in order to achieve that we can create add(num1, num2)
	 * ssum(num1, num2,num3)
	 * and while calling these method we will have to remember all the diferent aruments name method and it will be very hetcic job
	 * so to avoild that what we ccan do is
	 * we can keep the method name same and number of argument different and thats how we can achieve it by using overloading fetaure of Opps.
	 * 
	 */
	
	public void add(int num1 , int num2) {
		System.out.println("Adding 2 int number");
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println("Adding 3 int number");
	}
	
	public void add(float num1 , float num2) {
		System.out.println("Adding 2 float number");
	}
	
	
	/*
	 * So we can notice that we have created the same method name with different argument and that is nothing but its called as method overloading.
	 * 
	 * Can we achieve overloading by changing the return type.
	 * Answer - No, we can not because while calling that method through an object the object is going to get confuse that which method it has to pick and
	 * it can make mistake thats why it treat them as duplicate method.
	 * 
	 */
	

}
