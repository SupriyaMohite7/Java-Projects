package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<>();

		a1.add("Anita");
		a1.add("Amruta");
		a1.add("Pradnya");
		a1.add("Gunjan");
		System.out.println(a1);
		System.out.println("--------------------------------------------");
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("Gunjan"))
			{
				itr.remove();
			}
		}
		System.out.println(a1);
		a1.add("Gunjan");
		while(itr.hasNext())
		{
			if(itr.next().equals("Gunjan"))
			{
				((List<String>) itr).add("supriya");
			}
		}
		System.out.println(a1);
	}

}
