package com.basics;

public class Anagram {


static void sort(char[] ch)
{
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		}
	}


}
static void check(String s1,String s2)
{
	boolean status;
	if(s1.length() !=s2.length())
	{
		status= false;
	}
	else
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		sort(ch1);
		sort(ch2);
	
	for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				status= false;
			}
			
		}status= true;
	}
	  if (status) {  
          System.out.println(s1 + " and " + s2 + " are anagrams");  
      } else {  
          System.out.println(s1 + " and " + s2 + " are not anagrams");  
      }  
}


	public static void main(String args[])
	{
	
	String s1="cat";
	String s2="act";
	check(s1,s2);
	}


}
