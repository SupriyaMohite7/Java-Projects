package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Assignment3 {

	public static void main(String[] args) {
/*
 * 15.	WAP to search the specified collection in this collection
 */
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(80);
		a3.add(90);
		a3.add(100);
		System.out.println(a1.containsAll(a2));
		System.out.println(a1.containsAll(a3));

		System.out.println("==================================================");

/*
 * 16.	WAP to retrieve an element (at a specified index) from a given ArrayList
 */
		ArrayList<Integer> one = new ArrayList<>();
		one.add(10);
		one.add(20);
		one.add(30);
		one.add(40);
		one.add(50);
		System.out.println(one);
		System.out.println("At 2nd index : "+one.get(2));
		
		System.out.println("==================================================");

/*
 * 17.	WAP to insert an element into the ArrayList at the first position
 */
		one.add(0, 00);
		System.out.println(one);

		System.out.println("==================================================");

/*
 * 18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers 
 * (using iterator)
 */
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=1;i<=50;i++)
		{
				num.add(i);		
		}
		Iterator<Integer> inum = num.iterator();
		while(inum.hasNext())
		{
			int n=inum.next();
			if(n%2 == 0)
			{
				System.out.print(n+" ");

			}
		}
		System.out.println("==================================================");

/*
 *  19.	WAP to match two collections
 */
		System.out.println("==================================================");

		System.out.println(a1.equals(a2));
		a2.add(50);
		a2.add(40);
		Collections.sort(a1);
		Collections.sort(a2);
		System.out.println(a1.equals(a2));
		System.out.println("==================================================");

/*
 * 20.	WAP to check if collection is empty
 */
		System.out.println(one.isEmpty());
		ArrayList a11=new ArrayList<>();
		System.out.println(a11.isEmpty());

		System.out.println("==================================================");

/*
 * 21.	WAP to convert collection into array
 */
		String lang[] = {"Hindi","English","Marathi"};
		ArrayList<String> langlist = new ArrayList<>(Arrays.asList(lang));

		System.out.println(" Array to Collection : "+langlist);
		
		
		String str[] = new String[langlist.size()];
		langlist.toArray(str);
		
		System.out.println(" Collection to Array : "+Arrays.toString(str));
		System.out.println("==================================================");

/*
 * 22.	WAP of swap two elements in an ArrayList
 */
		System.out.println(one);
		Collections.swap(one, 2, 4);
		System.out.println(one);
		System.out.println("==================================================");


/*
 * 23.	WAP to replace the second element of an ArrayList with the specified element
 */
		System.out.println(one);
		one.set(1, 15);
		System.out.println(one);

	}
	
	

}
