package com.custom;


 class Employee {
	
	
	int Id;
	String Name;
	int Salary;
	String Role;
	public int getSalary()
	{
		return Salary;
	}
	public void printDetatils()
	{
		System.out.println("Id Of "+Name+"is:-"+Id);
		System.out.println("Name Of Employee is:-"+Name);
		System.out.println("Role of "+Name+" is "+Role);
	}
}
	
public class Custom_method{
	

	public static void main(String[] args) {
		Employee omkar=new Employee();
	
		Employee gojo=new Employee();
		
		omkar.Id=101;
		omkar.Name="Omkar Salunkhe";
		omkar.Role="Manager";
		omkar.Salary=150000;
		omkar.printDetatils();
		System.out.println(omkar.getSalary());
		
		gojo.Id=102;
		gojo.Name="Sataro Gojo";
		gojo.Role="Owner";
		gojo.Salary=220000000;
		
	}	
}


