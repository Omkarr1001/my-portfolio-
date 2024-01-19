package com.addition;

public class Problems {
//problem no1: multiplication table 
	static void Table(int n)
	{
		int c=0;
		for(int i=1;i<=10;i++)
		{
			 c=n*i;
			 System.out.println(c +" ");
			
		}
		
		
		//Problem No2: to creat start pattern
		
	}
	static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	//Problem No3: find sum of n no in recursion function
	static int sumrec(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else 
		{
			return n+sumrec(n-1);
		}
	}
	static void pattren2(int n)	
	{
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	//Problem No 4:- to find a Fibonices series with  recursion
	static  int fib(int n)
	{
		if (n==1|| n==2)
		{
			return n-1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	//Problem No 5:-to create pattren using recursion
	
	static void pattren3(int n)
	{
		if(n>0)
		{
			pattren3(n-1);
			for(int i=0;i<n;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattren_rev(int n)
	{
		if(0<n)
		{
			pattren_rev(n-1);
			for(int i=n;i>0;i--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String []a)
	{
		Table(2);
		pattern(4);
		int c=sumrec(3);
		System.out.println(c);
		pattren2(5);
		int f=fib(7);
		System.out.println(c);
		pattren3(3 );
		pattren_rev(4);
		
	}
	
}
