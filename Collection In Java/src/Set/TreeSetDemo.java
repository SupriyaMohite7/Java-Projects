package Set;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<>();
		ts.add("One");
		ts.add("Two");
	//	ts.add(null);
		ts.add("Three");
		ts.add("Four");
		
		System.out.println(ts);
		System.out.println(".......................................");
		
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(".......................................");

		Iterator itr1=ts.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println(".......................................");
		
		for(String s : ts)
		{
			System.out.println(s);
		}
		System.out.println(".......................................");

		NavigableSet<String> ns = ts.descendingSet();
		for(String s : ns)
		{
			System.out.println(s);
		}
		System.out.println(".......................................");

		Set<String> syn = Collections.synchronizedSet(ts);
	}

}
