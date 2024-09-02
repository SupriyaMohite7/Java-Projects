package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Red");
		lhs.add("Blue");
		lhs.add("Green");
		lhs.add("purple");
		lhs.add(null);
		lhs.add("Red");
		lhs.add("Red");
		System.out.println(lhs);
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
