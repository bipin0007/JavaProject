package tenthclass;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		

		/*
		 * Array List is a class and it is implementing list as an interface.
		 * 
		 * Rules:
		 * 1. Elements are stored sequentially.
		 * 2. Used to store multiple element
		 * 3. Internal working is same as Arrays.
		 * 4. Null values are allowed in ArrayList
		 * 5. Duplicate values are allowed
		 * 6. Insertion order is maintained
		 * 7. Array list is dynamic in nature/size.
		 * 8. Whenever you are dealing with object it has not be null.
		 * 
		 * ArrayList doesn't accept Primitive data type, Hence we need to call the wrapper class names of the primitive data types.
		 * 
		 * 
		 * 
		 * 
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(400);
		list.add(50);
		list.add(1000);
		list.add(20);
		list.add(null);
		list.add(null);
		list.add(0, null);
		list.remove(2);
		System.out.println(list.contains(100));
		
		System.out.println(list.clone());
		
		System.out.println(list);
		
		
		System.out.println(list.get(5));
		
		System.out.println(list.contains(20));
		System.out.println(list.size());
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		// Add all the elements of list to another list
		ArrayList<Integer> a = new ArrayList<>();
		a.add(34);
		a.add(56);
		a.add(67);
		
		//list.addAll(a);
		//System.out.println(list.addAll(4, list));
		System.out.println(list);
		
		System.out.println(list.set(2, 97));
		System.out.println(list);
		//for loop
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		//Can i transfer a list element into a blank list? Lets check
		
		ArrayList<Integer> dummy = new ArrayList<>();
		dummy.add(11);
		dummy.add(22);
		dummy.add(5);
		
		
		
		
		
		
		
		
		
		

	}

}
