package Arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {

/*
 * 6.	WAP to use add all elements to ArrayList
 */

		ArrayList<Integer> one = new ArrayList<>();
		one.add(30);
		one.add(10);
		one.add(40);
		one.add(20);
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
 * 7.	WAP to sort a given ArrayList
 */
		System.out.println(one);
		Collections.sort(one);
		System.out.println(one);
		System.out.println("==================================================");

/*
 * 8.	WAP to copy one ArrayList into another
 */
		ArrayList<Integer> onecopy = new ArrayList<>();
		onecopy=one;
		//onecopy.add(90);
		System.out.println(onecopy);
		System.out.println("==================================================");

/*
 * 9.	WAP to compare two ArrayLists print if equal?
 */
		ArrayList<Integer> one1 = new ArrayList<>();
		one1.add(130);
		one1.add(120);
		one1.add(450);
		one1.add(250);
		one1.add(590);
		boolean flag=true;
		if(one1==null || onecopy==null)
		{
			flag=false;
		}
		 if(one1.size()!=onecopy.size())
		{
			flag=false;
		}
		else
		{
			flag=one1.equals(onecopy);
		}
			System.out.println(one1);
			System.out.println(onecopy);

		if(flag)
		{
			System.out.println("Arrylists are Equal");
		}
		else
		{
			System.out.println("Arrylists are Not Equal");
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		if(one==null || onecopy==null)
		{
			flag=false;
		}
		 if(one.size()!=onecopy.size())
		{
			flag=false;
		}
		else
		{
			flag=one.equals(onecopy);
		}
			System.out.println(one);
			System.out.println(onecopy);

		if(flag)
		{
			System.out.println("Arrylists are Equal");
		}
		else
		{
			System.out.println("Arrylists are Not Equal");
		}
		
		System.out.println("==================================================");

/* 
 * 10.	WAP to join two ArrayLists
 */
		System.out.println(one.addAll(one1));
		System.out.println(one);
		System.out.println("==================================================");

/*
 * 11.	WAP to clone an ArrayList to another ArrayList
 */
		ArrayList<String> twoclone= (ArrayList<String>) two.clone();
		System.out.println(twoclone);
		System.out.println(two.clone());
		ArrayList<String> newclone=new ArrayList<>(two);
		System.out.println(newclone);
		System.out.println("==================================================");
/*
12.	WAP to empty ArrayList
 */
		twoclone.removeAll(newclone);
		System.out.println(twoclone);
		System.out.println("==================================================");
		
/*
 * 13.	WAP to trim the capacity of an ArrayList the current list size
 */
		System.out.println(two.size());
		two.trimToSize();
		System.out.println(two.size());
		System.out.println("==================================================");

/*
 * 14.	WAP to increase the size of an ArrayList
 */
		ArrayList<Integer> checksize = new ArrayList<>();
		System.out.println(checksize.size());
		checksize.add(555);
		checksize.add(555);
		checksize.add(555);
		System.out.println(checksize.size());
		System.out.println("==================================================");

/*
 * 15.	WAP to update specific array element by given element
 */
		checksize.set(2, 777);
		System.out.println(checksize);
		System.out.println("==================================================");
		
/*
 * 16.	WAP to remove the third element from an ArrayList
 */
		checksize.remove(2);
		System.out.println(checksize);
		System.out.println("==================================================");
		
/*
 * 17.	WAP to shuffle elements in an ArrayList
 */
		System.out.println(one1);
		Collections.shuffle(one1);
		System.out.println(one1);
		System.out.println("==================================================");

/*
 * 18.	WAP to reverse elements in an ArrayList
 */
		System.out.println(one1);
		Collections.reverse(one1);
		System.out.println(one1);
		System.out.println("==================================================");

/*
 * 19.	WAP to extract a portion of an ArrayList
 */
			List<Integer> sublist = one1.subList(1, 3);
			System.out.println(sublist);
			System.out.println("==================================================");

/*
 * 20.	WAP to print all the elements of an ArrayList using the position of the elements
 */
			for(int i=0;i<one1.size();i++)
			{
				System.out.println("At Index "+i+" element : "+one1.get(i));
			}
			System.out.println("==================================================");

	}

}
