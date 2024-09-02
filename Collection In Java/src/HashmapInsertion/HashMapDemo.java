package HashmapInsertion;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<>();
		System.out.println(map.put("Supriya", 89));
		System.out.println(map.put("Supriya", 91));
		map.put("Rushikesh", 90);
		map.put("Mandar", 85);
		map.put("Amruta", 75);
		map.put("Pravin", 78);
		map.put("Pradnya", 87);
		map.put(null,null);
		System.out.println(map);
	


	}

}
