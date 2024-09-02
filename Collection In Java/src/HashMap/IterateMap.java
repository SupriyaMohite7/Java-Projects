package HashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India", 91);
		hm.put("UAE", 971);
		hm.put("USA", 1);
		hm.put("Germany", 49);
		hm.put("UK", 24);

		// 1st way
		System.out.println(hm);
		System.out.println("---------------------------------------------");

		// 2nd way

		Set<String> keys = hm.keySet();
		for (String k : keys) {
			System.out.println(k + " -> " + hm.get(k));
		}
		System.out.println("---------------------------------------------");

		// 3rd way
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+ " : "+hm.get(k));
		}
		System.out.println("---------------------------------------------");

		Collection<Integer> pins =hm.values();
		for(Integer i:pins)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------------------------");

		Set<Entry<String,Integer>> en=hm.entrySet();
		for(Entry<String,Integer> e:en)
		{
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		System.out.println("---------------------------------------------");

		for(Map.Entry<String, Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey()+"  "+e.getValue());
	
		}
	}

}
