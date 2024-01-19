package Demo;

import java.util.Scanner;

public class SumOfij {
	
	
	public int getSum(int t[][]) {
		int sum=0;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Row:- ");
		 i=sc.nextInt();
		
		System.out.print("Enter a Colum no:-  ");
		j=sc.nextInt();
		
		
		if(i>2 || j>2)
		{
			System.out.println("Your option is incorrect Our matrix is 3 by 3 plzz enter valid no ");
		}
		else
		{

			for(int no=0; no<t.length; no++ )
			{
				for(int no1=0; no1<t.length;no1++)
				{
					if(i==no || j==no1)
					{
						
						sum=sum+t[no][no1];
						System.out.print(t[no][no1]+" ");
						
						
					}
					
					
				}
				System.out.println();
				
				

			}
			}
		return sum;
		}
	

}
