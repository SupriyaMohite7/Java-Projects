package stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {


		Stack<String> s=new Stack<>();
		
		s.push("Priya");
		s.push("Komal");
		s.push("Pradnya");
		s.push("Nikita");
	
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);

		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.search("Priya"));
		System.out.println(s.search("Komal"));
		System.out.println(s.search("komal"));
		System.out.println(s.search("Gauri"));
		
		Enumeration<String> en =s.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
