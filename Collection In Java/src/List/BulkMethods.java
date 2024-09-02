package List;

import java.util.ArrayList;
import java.util.List;

public class BulkMethods {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<>();

		a1.add("Anita");
		a1.add("Amruta");
		a1.add("Pradnya");
		a1.add("Gunjan");
		System.out.println(a1);

		List<String> a2 = new ArrayList<>();

		a2.add("Komal");
		a2.add("Supriya");
		System.out.println(a2);

		a1.addAll(a2); // add AT end
		System.out.println(a1);

		a1.addAll(1, a2); // add at 1 index
		System.out.println(a1);

		System.out.println(a1.containsAll(a2));

		a2.add("Aishwarya");
		System.out.println(a1.containsAll(a2));

		a1.removeAll(a2);
		System.out.println(a1); // remove all elements of a2 from a1

		a2.add("sakshi");
		a2.add("pranita");
		a1.addAll(a2); // add AT end
		System.out.println(a1);

		a1.retainAll(a2);

		System.out.println(a1); // keep all common elements in a1 from a2

	}

}
