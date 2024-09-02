package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterate {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(3);
				
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		
		System.out.println(v1);
		System.out.println("------------------------------------------------");
		
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.elementAt(i));
		}
		System.out.println("------------------------------------------------");

		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		System.out.println("------------------------------------------------");

		for(Integer i:v1)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------------------------");

		Iterator<Integer> itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------------");

		ListIterator<Integer> itr1 = v1.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("------------------------------------------------");

		Enumeration<Integer> en =v1.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
