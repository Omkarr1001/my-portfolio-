package demo2;

import java.util.Scanner;

public class Swap_val {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no:-");
		int a=sc.nextInt();
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter 2nd no:-");
		int b=s1.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
