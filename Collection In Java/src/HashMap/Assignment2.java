
package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Assignment2 {

	public static void main(String[] args) {

/*
 * 1.	WAP to copy all of the mappings from the specified HashMap 
 * to another map
 */
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1,"C");
		hm.put(2,"C++");
		hm.put(3,"Java");
		hm.put(4,"Python");
		hm.put(5,"Angular");
		hm.put(6,"Selenium");
	
		System.out.println(hm);
		
		HashMap<Integer, String> hm1=new HashMap<>();
		hm1.putAll(hm);
		System.out.println(hm1);

		System.out.println("--------------------------------------------------");

/*
 * 2.	WAP to test a HashMap is empty or not
 */
		System.out.println(hm1.isEmpty());
		System.out.println("--------------------------------------------------");

/*
 * 3.	WAP to test if a HashMap contains a mapping for the specified key
 */
		if (hm.containsKey(2)) {
			System.out.println(hm.get(2));
			System.out.println("--------------------------------------------------");

/*
 * 4.	WAP to search for an element from HashMap using key
 */
			if (hm.containsKey(3)) {
				System.out.println(hm.get(3));
			
		}
			System.out.println("--------------------------------------------------");

/*
 * 5.	WAP to test if a HashMap contains a mapping for the specified value	
 */
			if (hm.containsValue("Angular")) {
				System.out.println(hm.get("Angular"));
			}
			System.out.println("--------------------------------------------------");


/*
 * 6.	WAP to remove an element from HashMap using key
 */

			if (hm.containsKey(3)) {
				hm.remove(hm.get(3));
		}
			System.out.println(hm);

			System.out.println("--------------------------------------------------");
	}

	}}
