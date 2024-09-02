package List;

import java.util.ArrayList;
import java.util.List;


public class Methods {

	public static void main(String[] args) {

		List<String> a1=new ArrayList<>();
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
		a1.add("Anita");
		a1.add("Amruta");
		a1.add("Pradnya");
		a1.add("Gunjan");
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		a1.add("Akshata");
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		a1.set(1, "Harshit");
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		System.out.println(a1.contains("Akshata"));
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		System.out.println(a1.contains("onkar"));
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		
		System.out.println(a1.remove(1));
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		
		System.out.println(a1.remove("Akshata"));
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		a1.add("mandar");
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
		a1.add(2, "priya");
		System.out.println(a1);
		System.out.println("------------------------------------------");
		
	}

}
