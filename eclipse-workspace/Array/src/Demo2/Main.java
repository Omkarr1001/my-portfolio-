package Demo2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter studentid:-");
		s.id=sc.nextInt();
     	System.out.println("\nEnter student Name:-");
     	s.name=sc.next();
     	
		System.out.println("\nEnter student MarksObtain:-");
		s.marksObtain=sc.nextInt();
		System.out.println("\nEnter studentTotalmarks:-");
		s.totalmarks=sc.nextInt();
		
		
	
		
		
		Student s1=new Student();
		System.out.println("\nEnter studentid:-");
		s1.id=sc.nextInt();
     	System.out.println("\nEnter student Name:-");
     	s1.name=sc.next();
     	
		System.out.println("\nEnter student MarksObtain:-");
		s1.marksObtain=sc.nextInt();
		System.out.println("\nEnter studentTotalmarks:-");
		s1.totalmarks=sc.nextInt();
		
		
		
		
		Student s2=new Student();
		System.out.println("\nEnter studentid:-");
		s2.id=sc.nextInt();
     	System.out.println("\nEnter student Name:-");
     	s2.name=sc.next();
     	
		System.out.println("\nEnter student MarksObtain:-");
		s2.marksObtain=sc.nextInt();
		System.out.println("\nEnter studentTotalmarks:-");
		s2.totalmarks=sc.nextInt();
		
		
		
		Student s3=new Student();
		System.out.println("\nEnter studentid:-");
		s3.id=sc.nextInt();
     	System.out.println("\nEnter student Name:-");
     	s3.name=sc.next();
     	
		System.out.println("\nEnter student MarksObtain:-");
		s3.marksObtain=sc.nextInt();
		System.out.println("\nEnter studentTotalmarks:-");
		s3.totalmarks=sc.nextInt();
		
		
		
		
		
		Student s4=new Student();
		System.out.println("\nEnter studentid:-");
		s4.id=sc.nextInt();
     	System.out.println("\nEnter student Name:-");
     	s4.name=sc.next();
     	
		System.out.println("\nEnter student MarksObtain:-");
		s4.marksObtain=sc.nextInt();
		System.out.println("\nEnter studentTotalmarks:-");
		s4.totalmarks=sc.nextInt();
			
		
		Student s5[]=new Student[5];
		
		s5[0]=s;
		s5[1]=s1;
		s5[2]=s2;
		s5[3]=s3;
		s5[4]=s4;
		
		
		for(int i=0;i<s5.length;++i)
		{
			//String result=" ";
			if(s5[i].marksObtain>=40)
			{
				System.out.println(s5[i].name+"pass");
				
			}
			else 
			{
				System.out.println(s5[i].name+"fail");
			}
			
			
		}
		
		
		
		
			
	
		
		
		
				
			
				
	
	
	}

}
