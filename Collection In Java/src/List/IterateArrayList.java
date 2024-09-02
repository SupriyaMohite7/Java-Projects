package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {


		List<String> a1 = new ArrayList<>();

		a1.add("Anita");
		a1.add("Amruta");
		a1.add("Pradnya");
		a1.add("Gunjan");
		System.out.println(a1);
		System.out.println("--------------------------------------------");

		// 1st way
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("--------------------------------------------");
		
		// 2nd way
		for(String s:a1)
		{
			System.out.println(s);
			}
		System.out.println("--------------------------------------------");

		//3rd way
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())		
		{
			System.out.println(itr.next());
				}
		System.out.println("--------------------------------------------");

		//4th way
		ListIterator<String> litr=a1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("--------------------------------------------");

		//5th way
				ListIterator<String> litr2=a1.listIterator(a1.size());
				while(litr.hasPrevious())
				{
					System.out.println(litr.previous());
				}
				System.out.println("--------------------------------------------");

	}

}
