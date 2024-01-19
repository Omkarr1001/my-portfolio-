package com.company;

class Student 
{
	private int id;
	private String name;
	public void setname(String name)
	{
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int getId()
	{
		return id;
	}
}





public class Setter_getter {
	public static void main(String[] args) {
		
		Student omkar=new Student();
		omkar.setname("Omkar Salunkhe");
		System.out.println(omkar.getName());
		omkar.setId(101);
		System.out.println(omkar.getId());
		
	}
	

}
