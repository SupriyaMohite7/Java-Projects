package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterartor {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		System.out.println(fruits);

		//for loop	
		
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		
		System.out.println("\n-------------------------\n");

		// enhanced for loop
		for(String f:fruits)
		{
			System.out.println(f);

		}
		
		System.out.println("\n-------------------------\n");

		//iterator
		
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n-------------------------\n");
		
		Iterator<String> itr2=fruits.descendingIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("\n-------------------------\n");
		
		ListIterator<String> itr3=fruits.listIterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
		System.out.println("\n-------------------------\n");

		ListIterator<String> itr4=fruits.listIterator();
		while(itr4.hasPrevious())
		{
			System.out.println(itr4.previous());
		}

		
	}

}
