package vector;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeIterator {

	public static void main(String[] args) {

		Vector<Integer> v1=new Vector<>();
		v1.add(8);
		v1.add(10);
		v1.add(-20);
		v1.add(75);
		v1.add(4);
		v1.add(4);
		System.out.println(v1);
		
		Enumeration<Integer> en = v1.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement()==-20)
			{
				v1.add(20);
			}
		}		System.out.println(v1);

	}

}
