package Set;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {

		HashSet<Item> hs= new HashSet<>();
			hs.add(new Item(1,"Chips",90));
			hs.add(new Item(2,"Biscuits",100));
			hs.add(new Item(3,"DairyMilk",50));
			hs.add(new Item(4,"popcorn",150));
			hs.add(new Item(1,"Chips",90));
			hs.add(new Item(2,"Biscuits",100));
			
			for(Item i:hs) {
			System.out.println(i);}
	}

}
