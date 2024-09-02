package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrayConversion {

	public static void main(String[] args) {

		String lang[] = { "C", "Python", "Java", "Angular" };

		System.out.println("from Array to collection");

		// 1st way

		List<String> list = Arrays.asList(lang);
		System.out.println(list);

		// 2nd way

		ArrayList<String> alist = new ArrayList(Arrays.asList(lang));
		System.out.println(alist);

		// 3rd way
		ArrayList<String> alist2 = new ArrayList<>();
		Collections.addAll(alist2, lang);
		System.out.println(alist2);

		System.out.println("from Arraylist to Array ");

		// not type safe

		Object[] arr = alist.toArray();
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((String) arr[i]).toUpperCase();
		}

		System.out.println(Arrays.toString(arr));

// type safe

		String str[] = new String[alist.size()];
		alist.toArray(str);
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].toLowerCase();
		}

		System.out.println(Arrays.toString(str));

	}

}
