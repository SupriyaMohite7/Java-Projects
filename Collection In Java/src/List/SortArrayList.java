package List;

import java.util.ArrayList;

public class SortArrayList {
	static void sort(ArrayList<Double> a1)
	{
		for(int i=0;i<a1.size();i++)
		{
			for(int j=0;j<a1.size();j++)
			{
				if(a1.get(i)<a1.get(j))
				{
					double temp=a1.get(i);
					a1.set(i, a1.get(j));
					a1.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Double> marks=new ArrayList<>();
		marks.add(12.3);
		marks.add(54.3);
		marks.add(78.3);
		marks.add(65.3);
		marks.add(98.3);
		marks.add(15.3);
		marks.add(90.3);
		System.out.println("Before : "+marks);
		sort(marks);
		System.out.println("After : "+marks);	
	}

}
