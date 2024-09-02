package Set;

import java.util.Comparator;
import java.util.TreeSet;
class ItemComparator implements Comparator
{
@Override
public int compare(Object o1, Object o2) {
	if(((Item) o1).getCost()==((Item) o2).getCost())
		return ((Item) o1).getName().compareTo(((Item) o2).getName());
	else
		return (int) (((Item) o2).getCost()-((Item) o1).getCost());
}
	
}
public class ItemTreeSet {

	public static void main(String[] args) {

		TreeSet<Item> ts = new TreeSet<>(new ItemComparator());
		ts.add(new Item(1,"Chips",90));
		ts.add(new Item(2,"Biscuits",100));
		ts.add(new Item(3,"DairyMilk",50));
		ts.add(new Item(4,"popcorn",150));
		ts.add(new Item(1,"Chips",90));
		ts.add(new Item(2,"Biscuits",100));
		
		for(Item i:ts)
		{
		System.out.println(i);
		}
		System.out.println("---------------------------------");
	}

}
