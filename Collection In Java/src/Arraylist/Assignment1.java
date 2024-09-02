/*
 * 1.	WAP to add elements to arraylist without using generics (no <>) 
 * and print content of it where Integer is used. In second arraylist String
 *  is used.
 */
package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {

	public static void main(String[] args) {

		ArrayList<Integer> one = new ArrayList<>(2);
		System.out.println(one.size());
		one.add(10);
		one.add(20);
		one.add(30);
		one.add(40);
		one.add(50);
		System.out.println(one);

		ArrayList<String> two = new ArrayList<>();
		two.add("red");
		two.add("yellow");
		two.add("pink");
		two.add("blue");
		two.add("green");
		System.out.println(two);
		System.out.println("==================================================");
		/*
		 * 2. WAP add elements to arraylist without using generics, 0th location keep
		 * Integer, 1st location String now print each element and display contents.
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("one");
		System.out.println(list);
		System.out.println("==================================================");

		/*
		 * 3. WAP to use add operation of ArrayList
		 */
		ArrayList list2 = new ArrayList();
		list2.add(2);
		list2.add("two");
		System.out.println(list2);
		System.out.println("==================================================");

/*
 * 4. WAP to print all elements of ArrayList using iterator
 */
		Iterator<String> itr = two.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		Iterator<Integer> itr2 = one.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		Iterator itr3 = list.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("==================================================");
/*
 * 5. WAP to iterate through all elements in an ArrayList using for loop
 */
		for (int i = 0; i < one.size(); i++) {
			System.out.println(one.get(i));
		}

		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		for (int i = 0; i < two.size(); i++) {
			System.out.println(two.get(i));
		}

		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==================================================");

/*
 * 6. WAP to iterate through all elements in an ArrayList using for each
 */
		for (Integer it : one) {
			System.out.println(it);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		for (String st : two) {
			System.out.println(st);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		for (Object o : list) {

			System.out.println(o);
		}

	}

}
