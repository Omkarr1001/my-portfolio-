package demo2;

import java.util.Scanner;

public class Max_min {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st no:-");
		int a=sc.nextInt();
		
		

		Scanner s1= new Scanner (System.in);
		System.out.println("Enter a 2nd  no:-");
		int b=s1.nextInt();
		
		
		 if(a>b)
		 {
			 System.out.println(a   + "  First no is Maximum");
			 System.out.println(b  +  "  Secound no is minimum");
			 
		 }
		 else if(a==b) {
			 System.out.println(a + "  both are same ");
			 
		 }
		 else
		 {
			 System.out.println(b  + "   Secound no is maximum");
			 System.out.println(a  + "   no is minimum");
		 }
	}

}
