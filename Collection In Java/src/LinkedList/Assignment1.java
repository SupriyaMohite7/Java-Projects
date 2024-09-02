package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment1 {

	public static void main(String[] args) {

/*
 * 1.	WAP to append the specified element to the end of a linked list.
 */
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		int n=3;
		list.add(n); 
		System.out.println(list);
		System.out.println("==================================================");
		
/*
 * 2.	WAP to iterate through all elements in a linked list.
 */
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==================================================");

/*
 * 3.	WAP to iterate through all elements in a linked 
		list starting at the specified position.
 */
		Iterator itr1 = list.listIterator(1);
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("==================================================");
		
/*
 * 4.	WAP to iterate a linked list in reverse order.
 */
		Iterator itr2 = list.descendingIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("==================================================");

/*
 * 5.	WAP to insert the specified element at the specified position in the 
 * linked list.
 */
		list.add(1, 4);
		System.out.println(list);
		System.out.println("==================================================");

/*
 * 6.	WAP to insert elements into the linked list at the first and last position.
7.	WAP to insert the specified element at the front of a linked list.
8.	WAP to insert the specified element at the end of a linked list.

 */
		list.addFirst(0);
		list.addLast(5);
		System.out.println(list);
		System.out.println("==================================================");

		
/*
 * 9.	WAP to insert some elements at the specified position into a linked list.
 */
		list.add(2, 6);
		list.add(4, 7);
		System.out.println(list);
		System.out.println("==================================================");
	
/*
 * 10.	WAP to get the first and last occurrence of the specified elements in a linked list.
 */
		int first = list.indexOf(1);
		int last = list.lastIndexOf(1);
		System.out.println("First index of 1 : "+first);
		System.out.println("Last index of 1 : "+last);
		System.out.println("==================================================");

/*
 * 11.	WAP to display the elements and their positions in a linked list.
 */
		for(int i=0;i<list.size();i++)
		{
			System.out.println("At Posistion "+i+" Element : "+list.get(i));
		}
		System.out.println("==================================================");

/*
 * 12.	WAP to remove a specified element from a linked list.
 */
		list.remove(5);
		System.out.println(list);
		System.out.println("==================================================");
		
/*
 * 13.	WAP to remove first and last element from a linked list.
 */
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println("==================================================");
		
/*
 * 14.	WAP to remove all the elements from a linked list.
 */
		list.removeAll(list);
		System.out.println(list);
		System.out.println("==================================================");
	}

	

}
