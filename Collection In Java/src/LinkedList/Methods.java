package LinkedList;

import java.util.LinkedList;

public class Methods {

	public static void main(String[] args) {

		LinkedList<String> comp=new LinkedList();
		
		//System.out.println(comp.getFirst()); 	No such element exception
		System.out.println(comp.peekFirst());  // null
		//System.out.println(comp.remove());   	No such element exception
		System.out.println(comp.poll());  // null
		//System.out.println(comp.element());  No such element exception

		comp.add("wipro"); // boolean and belong from list interface

	}

}
