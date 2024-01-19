package com.custom;
 class Employee1{
	 int salary;
	 String name;
	 public int getSalary()
	 {
		 return salary;
		 
	 }
	 public String getName()
			 {
		 return name; 
			 }
	 public void setName(String n)
	 {
		 name=n;
		 
	 }
	
	 int side;
		 public int area()
		 {
			 return side*side;
		 }
		 public int perimeter() {
			 return 4*side;
		 }
	 }
	

public class Practice_method {
	public static void main(String[] args) {
		
	
	Employee1 omkar=new Employee1();
	omkar.setName("Omkar");
	System.out.println(omkar.getName());
	omkar.salary=12000;
	System.out.println(omkar.getSalary());
	Employee1 sq=new Employee1();
	 sq.side=10;
	System.out.println(sq.area());
	System.out.println(sq.perimeter());
	
	
	

}}
