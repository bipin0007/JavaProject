package sixthClass;

public class OveridingApplication {

	public static void main(String[] args) {
		RBI r = new RBI();
		r.checkBalance();
		r.giveinterest();
		
		
		SBIBank s = new SBIBank();
		s.checkBalance();
		s.giveinterest();
		
		
		HDFCBank h = new HDFCBank();
		h.giveinterest();

	}

}
