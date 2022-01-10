package seventhclass;

public abstract class AbstractDemo1 extends SBIBank implements RBI{
	
	public void deposite() {      //Normal method
		System.out.println("Deposite");
	}
	
	public abstract void homeloan();    //Abstract Method
	
	
	
	/*
	 * An abstract class can contain regular and abstract method.
	 * 
	 * Any method without a body should contain a Abstract keyword.
	 * 
	 */
	
	
	

}
