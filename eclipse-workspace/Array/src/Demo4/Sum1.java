package Demo4;

import java.util.Scanner;

public class Sum1 {
	
	
	

	public static void main(String[] args) {
		 
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		 int s[]=new int[5];
		System.out.println("Enter a 7 number:- ");
		
	
		
		
		for(int i=0;i<s.length;i++)
		{
	 s[i]=sc.nextInt();
	sum+=s[i];
	sc.close();
		
	
		
		}
		
		System.out.println("The Sum of Number is:-");
	}

}
