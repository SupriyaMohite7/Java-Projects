package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Assignment2 {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		list.offer(1);
		list.offer(2);
		list.offer(3);
		list.offer(4);
		list.offer(5);
		list.offer(6);
		list.offer(7);
		list.offer(8);
		list.offer(9);
		LinkedList<Integer> list2=new LinkedList<>();
		list2.offer(99);

/*
 * 1.	WAP to shuffle the elements in a linked list.
 */

		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("==================================================");

/*
 * 2.	WAP to join two linked lists.
 */
		list.addAll(list2);
		System.out.println(list);
		System.out.println("==================================================");
		
/*
 * 3.	WAP to clone a linked list to another linked list.
 */
		LinkedList<Integer> listcopy=(LinkedList<Integer>) list.clone();
		System.out.println(listcopy);
		System.out.println("==================================================");

/*
 * 4.	WAP to remove and return the first element of a linked list.
 */
		list.get(0);
		list.remove(0);
		System.out.println(list);
		System.out.println("==================================================");
		
/*
 * 5.	WAP to retrieve but does not remove, the first element of a linked list.
 */
		System.out.println(list.element());
		System.out.println("==================================================");

/*
 * 6.	WAP to retrieve but does not remove, the last element of a linked list.
 */
		System.out.println(list.getLast());
		System.out.println("==================================================");

/*
 * 7.	WAP to check if a particular element exists in a linked list.
 */
		System.out.println(list.contains(7));
		System.out.println(list.contains(77));
		System.out.println("==================================================");

/*
 * 8.	WAP to convert a linked list to array list.
 */
		ArrayList<Integer> alist = new ArrayList<>(list);
		System.out.println(alist);
		System.out.println("==================================================");

/*
 * 9.	WAP to compare two linked lists.
 */
		System.out.println(list);
		System.out.println(list2);
		Boolean areEqual = list.equals(list2);
		if(areEqual)
		{
			System.out.println("list and list2 are equal");
		}
		else
		{
			System.out.println("list and list2 are not equal");

		}
		System.out.println("==================================================");

/*
 * 				10.	WAP to test a linked list is empty or not.
 */
		System.out.println(list2.isEmpty());
		list2.removeAll(list2);
		System.out.println(list2.isEmpty());
		System.out.println("==================================================");
/*
 * 		11.	WAP to replace an element in a linked list.
 */
		System.out.println(list);
		list.set(2, 7);
		System.out.println(list);
		System.out.println("==================================================");


	}

}
