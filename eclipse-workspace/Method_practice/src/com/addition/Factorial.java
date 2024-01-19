package com.addition;

public class Factorial {
	static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
		
		
		
	}
	static int factorial1(int n)
	{
	
		int product=1;
		for(int i=n ;i>0;i--)
		{
			product*=i;
		}
		return product;
	}
	static void fibonicis(int j)
	{
		int n1=0,n2=1,n3;
		for(int i=0;i<=j;i++)
		{
			System.out.print(n1 +" ");
			
			n3=n2+n1;
			n1=n2;
			n2=n3;
		}
	
	
	
	}
	public static void main(String[]arg)
	{
		int c=factorial(5);
		System.out.println(c);
		int d=factorial1(0);
		System.out.println(d);
		
		
		fibonicis(10);
		
	}

}
