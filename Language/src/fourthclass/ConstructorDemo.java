package fourthclass;

public class ConstructorDemo {
	
	public void getinfo() {
		System.out.println("This is the get info method");
	}
	
	public ConstructorDemo() {
		System.out.println("I am inside Non parametrized constuctor");
	}
	

	public ConstructorDemo(String messsage) {
		System.out.println("I am inside parametrized constuctor and the message is  " + messsage);
	}
	
	public ConstructorDemo(String messsage, int n) {
		System.out.println("I am inside parametrized constuctor and the message is  " + messsage + n);
	}
	
	
	public void add(int num1 , int num2) {
		System.out.println(num1+num2);
		
	}

}
