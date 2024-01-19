package Revision;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int n1=0,n2=0,c,ch = 0;
		Scanner sc=new Scanner(System.in);
		
		
		do {	
			
			System.out.println("\n1:Addition ");
			System.out.println("\n2:Substraction ");
			System.out.println("\n3:-Multiplication ");
			System.out.println("\n4:Divison ");
			System.out.println("0:-Exit");
			System.out.print("\nEnter a Choice:- ");
			ch=sc.nextInt();


		
	
		
switch(ch)
	{

    case 0:
    	
    	System.out.print(" Exit from menu");
    	break;
    	
	case 1:
		
		System.out.print("Enter First NO:- ");
		n1=sc.nextInt();
		
		System.out.print("\nEnter Secound No:- ");
		n2=sc.nextInt();
		
		c=n1+n2;
		System.out.println("Addition is:- "+c);
		break;
	
	case 2:
		System.out.print("Enter First NO:- ");
		n1=sc.nextInt();
		
		System.out.print("\nEnter Secound No:- ");
		n2=sc.nextInt();
		c=n1-n2;
		System.out.println("Substraction is:- "+c);
		break;
		
	case 3:
		System.out.print("Enter First NO:- ");
		n1=sc.nextInt();
		
		System.out.print("\nEnter Secound No:- ");
		n2=sc.nextInt();
		c=n1*n2;
		System.out.println("Multication is:- "+c);
		break;
		
	case 4:
		System.out.print("Enter First NO:- ");
		n1=sc.nextInt();
		
		System.out.print("\nEnter Secound No:- ");
		n2=sc.nextInt();
		if(n2!=0)
		{
			c=n1/n2;
			System.out.println("Divison is:- "+c);
			
		}
		else 
		{
			System.out.println("Cannot divided by zero");
			
		}
		break;
		
	case 5:
		
		
	default:
		System.out.println("Invalid No:- ");
	}
	}while (ch!=0);
	
		 sc.close();
	
		
		
		
	
}
}
	


