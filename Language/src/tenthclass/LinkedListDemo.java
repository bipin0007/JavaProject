package tenthclass;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Linked list is a class thats extends List Interface and it is almost similar to ArrayList
		 * 
		 * Whenever you are using set method in Java you are updating the value.
		 * 1. Linked list stores data using nodes in memory and these node always conatins 3 things with them
		 * 1. Previous Element address
		 * 2. Value stored in memory
		 * 3. Next Element address. 
		 * 
		 * 2. It allows duplicate values to be store
		 * 3. It allows null values to be stored
		 * 4. Linked list internally uses doubly linked list concept.
		 * 5. Linked list is memory efficient as compare to Array list
		 * 6. In this if you remove any data from memory only the address of the data is being updated but in Array list all the data get shift to whatever we remove.
		 * 7. Performance is little slow as compared to Array list But when you keep on changing the elements then the performance is good.
		 */
		
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(100);
		l.add(102);
		l.add(10);
		l.add(24);
		l.add(105);
		l.add(null);
		l.add(105);
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.get(4));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.set(0, 500));
		System.out.println(l);
		l.addFirst(100);
		System.out.println(l);
		l.addLast(150);
		System.out.println(l);
		//l.clear();
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		
		
		
		
	}

}
