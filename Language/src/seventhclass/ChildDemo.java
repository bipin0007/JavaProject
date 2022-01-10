package seventhclass;

public class ChildDemo extends AbstractDemo1{

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	public void Withdraw() {
		depositeMoney();
		System.out.println("Withdwals");
		
	}
	
	public static void main(String[] args) {
		ChildDemo c = new ChildDemo();
		c.deposite();
		c.Withdraw();
	}
	
	

}
