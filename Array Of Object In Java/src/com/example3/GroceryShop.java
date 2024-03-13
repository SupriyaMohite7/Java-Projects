package com.example3;

public class GroceryShop {

	public static void find(Supplier[] sup,String itemname)
	{
		System.out.println(" Supplier of rice : \n ");
		for(Supplier s:sup) {
			for(Item i:s.getItem())
			{
				if(i.getIname().equals(itemname))
				{
					System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSmob());
				}
			}					

		}
	}

	public static void main(String[] args) {

		Supplier sup[]=new Supplier[3];
		
		Item it[]=new Item[4];
		
		it[0]=new Item(1,"Tea",10);
		it[1]=new Item(2,"Sugar",10);
		it[2]=new Item(3,"Milk",10);
		it[3]=new Item(4,"Rice",10);
		
		sup[0]=new Supplier(1,"ABC",1111111111,it);
		
		Item it1[]=new Item[3];
		it1[0]=new Item(1,"Tea",10);
		it1[1]=new Item(2,"Sugar",10);
		it1[2]=new Item(3,"Milk",10);
		
		
		sup[1]=new Supplier(2,"DEF",1111111111,it1);
		
		Item it2[]=new Item[5];
		it2[0]=new Item(1,"Tea",10);
		it2[1]=new Item(2,"Sugar",10);
		it2[2]=new Item(3,"Milk",10);
		it2[3]=new Item(4,"Rice",10);
		it2[4]=new Item(4,"Rice",10);
		
		sup[2]=new Supplier(2,"GHI",1111111111,it2);
		
		for(Supplier s:sup)
		{
			System.out.println(s);
		}
		System.out.println("=====================");
		for(Supplier s:sup)
		{
			System.out.println(s.getSid()+""+s.getSname());
			for(Item i:s.getItem())
			{
				System.out.println(i);
			}
			System.out.println("............................");
		}
		System.out.println("====================================");
		find(sup,"Rice");
	}
	

}
