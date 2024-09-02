package List;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(89);
		list.add(55);
		
		System.out.println(list);
		System.out.println("-------------------------------");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));

			int data=(int)list.get(i)+10;
			list.set(i, data);

		}
		System.out.println("-------------------------------");

		System.out.println(list);

	}

}
