package Arraylist3;
import java.util.ArrayList;
import java.util.Collections;

/*
 * WAP to sort the elements of List that contains String objects.Print ArrayList.
 * Sort using 
Collections.sort(list) method. Print ArrayList
 */
public class Sort {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("Supriya");
		name.add("Pradnya");
		name.add("Amruta");
		name.add("Anita");
		name.add("Onkar");
		name.add("Pravin");
		name.add("Rushikesh");
		name.add("Ganesh");
		name.add("Saurabh");
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);

	}

}
