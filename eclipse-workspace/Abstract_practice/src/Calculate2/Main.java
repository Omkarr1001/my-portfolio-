package Calculate2;

import java.util.Scanner;

 class Logic extends Calculator
{
	 
	 
	 
	 public void addition(int a,int b) {
			
			int c=a+b;
			System.out.println("addition is :-"+c);
			
		}


	
	

	public  void substraction(int a,int b) {
			int c=a-b;
			System.out.println("Substraction is :-"+c);
			
			
		}
	
	
	public void multiplication(int a,int b) {
		int c=a*b;
		System.out.println("Multiplication is:-"+c);
	}

	public void divison(int a, int b) {
	
		if(b==0)
		{
			System.out.println("b cannot be zero in divsion");
		}
		else
		{
			int c=a/b;
			System.out.println("Divsion is :-"+c);
			
		}
	}
	
	}

public  class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no:-");
		int a=sc.nextInt();
		
		System.out.println("Enter Secound no:-");
		int b=sc.nextInt();
		Calculator l1=new Logic();
		l1.addition(a, b);
		l1.substraction(a, b);
		l1.multiplication(a, b);
		l1.divison(a, b);
		
		
		sc.close();
	}
	}
		
	