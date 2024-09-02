package List;

import java.util.ArrayList;

public class ReverseArrayList {
	static void rev(ArrayList<Integer> n)
	{
		for(int i=0, j=n.size()-1;i<n.size()/2;i++,j--)
		{
			int temp=n.get(i);
			n.set(i, n.get(j));
			n.set(j, temp);
		}
		
	}

	public static void main(String[] args) {

		ArrayList<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		System.out.println("Before Reverse : "+num);
		rev(num);
		System.out.println("After Reverse : "+num);

	}

}
