package com.practice;

interface BasicAnimal
{
		void eat();
		void sleep();
}
class Monkey 
{
	Monkey()
	{
		System.out.println("I am Monkey");
	}
	Monkey(String M)
	{
		System.out.println("I am Monkey of parametrized");
	}
	void Jump() {
		System.out.println("Mokey is Jump to high");
	}
	void Bite()
	{
		System.out.println("please stay away otherwise mokey will bite");
	}
}
class Human extends Monkey implements BasicAnimal
{

	
	
	Human()
	{
		super("omkar");	
		System.out.println("I Am Human");
	}
	public void speak()
	{
		System.out.println("human is speaking... ");
	}
	public void eat()
	{
		System.out.println("all Animal can eat ");
	}
	public void sleep()
	{
		System.out.println("all Animal can sleep");
	}
}
public class Practice_abstract {
	public static void main(String[] args) {
		//BasicAnimal h=new Human  ();
		//h.eat();
		//h.sleep();
		Human m=new Human ();
		
		
		
		
	}

}
