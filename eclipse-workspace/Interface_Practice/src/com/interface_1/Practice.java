package com.interface_1;

interface A{
	 void greet();
	 private void greet2() {
		 System.out.println("Good Night");
	 }
	 default void greet1() {
		 greet2();
		 System.out.println("Good Morning");
	 }
	 
}
class B implements A
{
	public  void greet()
	{
		System.out.println("Good Afternoon");
	}
}
public class Practice {
	public static void main(String[] args) {
		A obj=new B();
		obj.greet();
		obj.greet1();
	}
	

}
