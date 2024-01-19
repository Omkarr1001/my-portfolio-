package Demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String Role;
	int Salary;
	
	Scanner sc=new Scanner(System.in);
	
	
	
	public void getdata()
	{
		System.out.println("\nEnter id,name,Role and Salary :");
		id=sc.nextInt();
		name=sc.next();
		Role=sc.next();
		Salary=sc.nextInt();
		
	}
	
	
}
