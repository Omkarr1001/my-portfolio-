package demo2;

import java.util.Scanner;

public class Max_min1 {
	public static void main(String[] args) {
		
	
	
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter a 1st no:-");
	int a=sc.nextInt();
	
	Scanner  s1=new Scanner(System.in);
	System.out.println("enter a 2nd no:-");
	int b=sc.nextInt();

	Scanner  s2=new Scanner(System.in);
	System.out.println("enter a 3nd no:-");
	int c=sc.nextInt();
	
	if(a==b && b==c)
	{
		System.out.println("Both no are same  "+a);
		
	}
	else if(a==b && b>c) 
		{
			System.out.println("A and B both are same ");
		}
		
		else if(a==c && c>b) {
			{
				System.out.println("A and c both are same and grator than c");
			}
			
	}
	
	else if(a>b&& a>c)
	{
		System.out.println("A is Maxium  "+a);
		
	}
	
	else if(b>c)
	{
		System.out.println("b is grator  "+b);
		
	}
	else 
	{
		System.out.println("C is grator ");
	}
	
	
	
}
}
