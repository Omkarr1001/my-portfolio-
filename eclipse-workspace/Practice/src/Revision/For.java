package Revision;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.print("Enter a Row:- ");
		i=sc.nextInt();
		
		System.out.print("Enter a Colum no:-  ");
		j=sc.nextInt();
		
		
		
		
		if(i>=6 || j>=6)
		{
			System.out.println("Your option is incorrect Our matrix is 5 by 5 plzz enter valid no ");
		}
		else
		{
		
		for(int no=1; no<=5; no++ )
		{
			for(int no1=1; no1<=5;no1++)
			{
				if(i==no || j==no1)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();

		}
		}
		System.out.print("Enter a zero for try again:-  ");
		k=sc.nextInt();
		}while(k==0);
		sc.close();
		}
	
			

}
