package com.practice;
abstract class Method
{
	abstract String write();
	abstract void refil();
	
	
}
class Use extends Method
{
	String write()
	{
		return "Write a Easy with pen";
	}
	void refil()
	{
		System.out.println("Yor Ink is low Please Refil it");
	}
	 void changeNib() {
		 System.out.println("Your nib is damge please change it");
	 }
}
public class Pen  {
	public static void main(String[] args) {
		Use p=new Use();
		p.refil();
		p.write();
		p.changeNib();
		
	}
}


