package vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		System.out.println(" Size : "+v.size());
		System.out.println(" Capacity : "+v.capacity());
		System.out.println("------------------------------------------------");
		
		Vector<Integer> v1 = new Vector<>(3);
		System.out.println(" Size : "+v1.size());
		System.out.println(" Capacity : "+v1.capacity());
		System.out.println("------------------------------------------------");
		
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(" Size : "+v1.size());
		System.out.println(" Capacity : "+v1.capacity());
		System.out.println("------------------------------------------------");
		
		v1.add(40);
		System.out.println(" Size : "+v1.size());
		System.out.println(" Capacity : "+v1.capacity());
		System.out.println("------------------------------------------------");
		
		System.out.println(v1);
		System.out.println("------------------------------------------------");

		System.out.println(v1.get(2));
		System.out.println(v1.elementAt(2));
		System.out.println("------------------------------------------------");
		
		System.out.println(v1.remove(1));
		v1.removeElementAt(1);
		System.out.println(v1);

		System.out.println("------------------------------------------------");

		v1.set(1, 100);
		System.out.println(v1);

		v1.setElementAt(50, 0);
		System.out.println(v1);

	}

}
