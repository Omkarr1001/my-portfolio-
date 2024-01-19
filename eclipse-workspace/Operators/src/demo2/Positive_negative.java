package demo2;

import java.util.Scanner;

public class Positive_negative {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st no:-");
		int a=sc.nextInt();
		
		if (a<0)
		{
			System.out.println("no is negative ");
		}
		else {
			System.out.println("no is positive ");
		}
		
	}

}
