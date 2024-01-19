package com.inherit;
class A
{
	 public A()
	{
		System.out.println("I am Constructor in Base Class");
	}
	public A(int a)
	{
		System.out.println("I am Overlodeed Constructor in Base  class");
		
	}
}
class B extends  A
{
	public B()
	{
		System.out.println("I am aconstructor in derived class");
	}
	public B(int  a,int  b)
	{
	super(a);
		System.out.println("I am overloded Constructor in Derived class");
	}
	

}
class C extends B
{


public C()
{
	System.out.println("i am Comstructor of derived class c");
	
}

public C(int  a,int b,int c)
{
	super(a, b );
	System.out.println("I am overloded construcor of derived class c");
}
}


public class Inheritance_Constructor {
public static void main(String[] args) {
	C inh=new C(4,5,6);
	
	
}
}
