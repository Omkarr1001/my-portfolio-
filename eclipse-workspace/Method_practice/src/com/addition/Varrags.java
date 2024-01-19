package com.addition;

public class Varrags {

	static int  Sum(int ...arr)
	{
		int c =0;
		
		for(int a:arr)
		{
			c +=a;
			
		}return c;
		
	}
public static void main(String []a)
{
	System.out.println("sum of 4 & 5 is " +Sum(4,5));
	
}
}
