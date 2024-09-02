package Set;

import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {

		HashSet<String> hs= new HashSet<>();
		hs.add("C++");
		hs.add("Java");
		hs.add("C");
		hs.add("Angular");
		System.out.println(hs);
		
		HashSet<String> hs1= new HashSet<>();
		hs1.add("C++");
		hs1.add("Java");
		hs1.add("Python");
		hs1.add("Selenium");
		System.out.println(hs1);
		
		// Mathematical Operations 
		
//		hs.addAll(hs1);
//		System.out.println(hs);
		
//		hs.removeAll(hs1);
//		System.out.println(hs);

		hs.retainAll(hs1);
		System.out.println(hs);

	}

}
