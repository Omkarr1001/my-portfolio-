package opps;

import java.util.Scanner;

public class Pen {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your time :-");
			int a=sc.nextInt();
			if(a>=12&&a<=18)
			{
				System.out.println("Good Aftrnoon sir ");
			}
			else if(a>=18&&a<=24)
			{
				System.out.println("Good Night sir ");
			}
			else if(a>1 && a<=12) {
				System.out.println("Good morning");
			}
		}
	}
	
	
	}


