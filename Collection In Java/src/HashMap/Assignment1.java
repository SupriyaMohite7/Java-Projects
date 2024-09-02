package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment1 {

	public static void main(String[] args) {
/*
 * WAP to add elements to a HashMap without using generics 
 * (ie do not use <>) and print content of it. Use Integer as Key and 
 * String as Value. In second HashMap add elements of String type as Key 
 * and Integer as Value.
 */
		HashMap hs=new HashMap<>();
		hs.put(1,"C");
		hs.put(2,"C++");
		hs.put(3,"Java");
		hs.put(4,"Python");
		hs.put(5,"Angular");
		hs.put(6,"Selenium");
	
		System.out.println(hs);
		System.out.println("--------------------------------------------------");
		
		HashMap hs1=new HashMap<>();
		hs1.put("Pooja",10);
		hs1.put("Rakesh",20);
		hs1.put("Prakash",30);
		hs1.put("Prasad",40);
		hs1.put("Pravin",50);
		hs1.put("Pranav",60);
		hs1.put("Prisha",10);
		System.out.println(hs1);
		

		System.out.println("--------------------------------------------------");

/*
 * 2.	WAP add elements to HashMap without using generics, 0th location
 *  use String as key and Integer as value, on 1st location use String as 
 *  key String and Integer as value.
 */
		HashMap hs2=new HashMap<>();
		hs2.put("Pooja",10);
		hs2.put("Pravin",50);
		
		System.out.println(hs2);
		System.out.println("--------------------------------------------------");

/*
 * 3.	WAP to add elements to a HashMap using generics with Integer as 
 * Key and String as value. And 4 key-value Map.Entry
 */
		HashMap<Integer, String> hs3=new HashMap();
		hs3.put(1,"C");
		hs3.put(2,"C++");
		hs3.put(3,"Java");
		hs3.put(4,"Python");
		for(Map.Entry<Integer, String> e : hs3.entrySet())
		{
			System.out.println(e);
		}
		System.out.println("--------------------------------------------------");
/*
 * 4.	WAP to create a map using Wrapper class as key and value same as 
 * keys’ data type WAP to count the number of key-value (size) mappings
 *  in a map.
 */
		System.out.println(hs3.size());	
		System.out.println("--------------------------------------------------");

/*
 * 5.	WAP to get all the entries from a HashMap.
 *  Iterate the entries and print the Key & Value values
 */
		for(Map.Entry<Integer, String> e : hs3.entrySet())
		{
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		System.out.println("--------------------------------------------------");

/*
 * 6.	WAP to get only the Keys from a HashMap
7.	WAP to get only the Values from a HashMap

 */

		for(Map.Entry<Integer, String> e : hs3.entrySet())
		{
			System.out.println(e.getKey());
		}
		System.out.println("--------------------------------------------------");
	
		for(Map.Entry<Integer, String> e : hs3.entrySet())
		{
			System.out.println(e.getValue());
		}
		System.out.println("-----------------------------------------------");

	}
	

}
