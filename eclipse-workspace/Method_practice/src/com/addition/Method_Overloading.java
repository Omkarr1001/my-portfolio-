package com.addition;

public class Method_Overloading {
	static int add(int a,int b)
	{
		return a+b;
	}
	static void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[]arg)
	{
		int e=add(10,22);
		System.out.println(e);
		add(11,22,33);
		
	}
	

}
