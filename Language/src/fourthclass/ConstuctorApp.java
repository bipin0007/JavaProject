package fourthclass;

public class ConstuctorApp {

	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo("Bipin");
		ConstructorDemo obj2 = new ConstructorDemo("Bipin", 2);
		
		obj1.add(2, 5);
		obj2.add(2, 4);
		obj.getinfo();

	}

}
