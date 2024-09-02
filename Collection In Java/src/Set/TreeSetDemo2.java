package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(20);
		ts.add(100);
		ts.add(250);
		ts.add(107);
		ts.add(209);
		ts.add(160);
		ts.add(280);
		ts.add(310);
		ts.add(920);
		
		System.out.println(ts);
		
		System.out.println("First : "+ts.first());
		System.out.println("Last : "+ts.last());
		
		System.out.println(ts.headSet(250));
		System.out.println(ts.tailSet(250));
		
		System.out.println(ts.headSet(250,true));
		System.out.println(ts.tailSet(250,false));

		System.out.println(ts.lower(250));
		System.out.println(ts.floor(250));
		
		SortedSet<Integer> ss = ts.subSet(20, 160);
		System.out.println(ss);
	}

}
