package List;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add(10);
		list.add("priya");
		list.add(89.4);
		list.add('A');
		
		System.out.println(list);
		System.out.println("-------------------------------");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			int data=(int)list.get(i)+10;
			list.set(i, data);
		}
	}

}
