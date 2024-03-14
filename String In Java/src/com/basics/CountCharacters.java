package com.basics;

public class CountCharacters {
	static int find(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch)
		{
			count++;
		}
		return count;
	}
	static void findVowelsConsonents(String s)
	{
		int vcount=0;
		int ccount=0;
		s=s.toUpperCase();
		char ch[]=s.toCharArray();
		
		for(char c:ch)
		{
			if(c ==' '|c =='.')
				continue;
			
			if(c =='A'| c=='E'|c=='I'| c =='O'|c=='U')
			{
				vcount++;
			}
			else {
				ccount++;
			}
			
		}
		System.out.println("vowels are :"+vcount);
		System.out.println("consonents are :"+ccount);
	}

	public static void main(String[] args) {

		String str="program is fun.i love programming.";
		System.out.println("Number of charactrs in :  "+str+" : "+find(str));
		findVowelsConsonents(str);
	}

}
