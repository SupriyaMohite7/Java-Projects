
package Arraylist;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
/*
 * 7.	WAP to create a new ArrayList, add some colors (string) and print the collection.
 */
		ArrayList clr = new ArrayList<>();
		clr.add("red");
		clr.add("yellow");
		clr.add("pink");
		clr.add("blue");
		clr.add("green");
		System.out.println(clr);
		System.out.println("==================================================");
		
//	8.	WAP to remove element from ArrayList
		
		clr.remove(1);
		System.out.println(clr);
		System.out.println("==================================================");
		
// 9.	WAP to remove all elements from ArrayList		
		
		clr.removeAll(clr);
		System.out.println(clr);
		System.out.println("==================================================");
		
// 10.	WAP to retain all elements from ArrayList
		
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");	
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Apple");
        arrayList2.add("Grapes");
        arrayList2.add("Strawberry");
        arrayList.retainAll(arrayList2);
		System.out.println(arrayList);

		System.out.println("==================================================");

// 11.	WAP to know how many elements in ArrayList

		System.out.println("no of elements in arraylist: "+arrayList.size());
		System.out.println("no of elements in arraylist2: "+arrayList2.size());
		System.out.println("no of elements in clr : "+clr.size());
		
		System.out.println("==================================================");

/*
 * 12.	WAP to test an ArrayList is empty or not
* 13.	WAP to empty ArrayList
 */
		ArrayList list = new ArrayList<>();
		if(list.isEmpty())
		{
			System.out.println("It is Empty");
		}
		else
		{
			System.out.println("It is not Empty");
		}
		
		System.out.println("==================================================");

/*
 * 14.	WAP to search an element from ArrayList
 */
		
		String search="Apple";
		int index=arrayList.indexOf(search);
		if(index >= 0)
		{
			System.out.println("Element found at location "+index);
		}
		else
		{
			System.out.println("Element not found");
		}
		// other method
		System.out.println(arrayList.contains(search));
		
		System.out.println("==================================================");


}

}
