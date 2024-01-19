package com.practice;
abstract class Telephone
{
	abstract void ring();
	abstract void light();
	abstract void disconnected();
}
class SmartTelephone extends Telephone
{
	void ring()
	{
		System.out.println("Some One is calling");
	}
	void light()
	{
		System.out.println("FlashLight is On");
	}
	void disconnected()
	{
		System.out.println("Simcard is Disconnected ");
	}
	
}

public class Practice_polymorphism {
	public static void main(String[] args) {
		Telephone C=new SmartTelephone ();
		C.light();
		C.ring();
	}

}
