package customHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentHashMap1 {
	
	static void createMapNames(HashMap<Integer, Student> sm)
	{
		// String: coursename
		// ArrayList<String>: student names
		HashMap<String,ArrayList<String>> hm= new HashMap<>();
		ArrayList<String> names;
		
		for(Map.Entry<Integer, Student> e: sm.entrySet())
		{
			String course= e.getValue().getCname();
			if(hm.containsKey(course))
			{
				names= hm.get(course);
//				names.add(e.getValue().getName());
//				hm.put(course, names);
			}
			else
			{
				names= new ArrayList<>();
//				names.add(e.getValue().getName());
//				hm.put(course, names);
			}
			
			names.add(e.getValue().getName());
			hm.put(course, names);
		}
		
		for(Map.Entry<String, ArrayList<String>> e: hm.entrySet())
		{
			System.out.println("Course:"+e.getKey());
			for(String s: e.getValue())
			{
				System.out.println(s);
			}
			System.out.println("..................................");
		}
		
		
	}

	public static void main(String[] args) {
		
		HashMap<Integer, Student> smap= new HashMap<>();
		
		smap.put(1, new Student(1, "Amruta", 78.4, "Java"));
		smap.put(2, new Student(2, "Harshit", 89.4, "Python"));
		smap.put(3, new Student(3, "Mandar", 90.3, "Java"));
		smap.put(4, new Student(4, "Ravindra", 91.4, "Java"));
		smap.put(5, new Student(5, "Shreyash", 82.4, "Python"));
		smap.put(6, new Student(6, "Anita", 75.6, "SQL"));
		System.out.println(smap.put(6, new Student(6, "Supriya", 95.6, "SQL")));
		System.out.println(smap.putIfAbsent(5,new Student(5, "Akshta", 90.3, "Java")));
		
		for(Map.Entry<Integer, Student> e:smap.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
		System.out.println("--------------------------------------");
		
		createMapNames(smap);
	}
}
