package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraylistToHashMap {

	static void check(ArrayList<String> name)
	{
		HashMap<String,Integer> hm=new HashMap<>();

		for(String n:name)
		{
			if(hm.containsKey(n))
			{
				hm.put(n, hm.get(n)+1);
			}
			else
			{
				hm.put(n, 1);
			}
			
		}
		for(Map.Entry<String, Integer> en: hm.entrySet())
		{
			System.out.println(en.getKey()+":"+en.getValue());
		}
	}
	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("mandar");
		a1.add("Pravin");
		a1.add("mandar");
		a1.add("rushikesh");
		a1.add("mandar");
		a1.add("Pravin");
		a1.add("mandar");
		a1.add("Pravin");
		a1.add("Pravin");
		check(a1);
	}

}
