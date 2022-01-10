package tenthclass;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashSet is a class implementing the set interface
		 * Hashset doesn't allow duplicate values to store
		 * Insertion order is not maintained, Elements are stored randomly 
		 * Indexing will not work here.
		 * rest all of the methods will remain same
		 * 
		 * 
		 */
		HashSet<String> h = new HashSet<>();
		h.add("Bipin");
		h.add("Bipin");
		h.add("Tanay");
		h.add("Dilip");
		h.add("Usha");
		h.add("Dilip");
		
		System.out.println(h);
		
		

	}

}
