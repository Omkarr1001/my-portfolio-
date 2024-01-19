package Demo2;
import java.util.ArrayList;
public class X {
	int i;
	void display(ArrayList<Employe>O)
	
	{
		 System.out.println("--------------------------------------------");
		 System.out.println("List Of Emplyee:- ");
		 System.out.println("--------------------------------------------");
		for(int i=0;i<O.size();i++)
		{
			Employe t=O.get(i);
			System.out.println(t.id+" "+t.name+" "+t.role+" "+t.salary);
		}
	}
	
 Employe maxSalary(ArrayList<Employe>O)
 {
	 System.out.println("--------------------------------------------");
	 System.out.println("Maximum Salary of Employee:- ");
	 
	 Employe Max=O.get(0);
	 for( i=0;i<O.size();i++)
	 {
		 Employe t=O.get(i);
		 if(t.salary>Max.salary)
		 {
			 Max=t;
		 }
		
	 }
	 return Max; 
 }
 
 Employe minSalary(ArrayList<Employe>O)
 {
	 System.out.println("--------------------------------------------");
	 System.out.println("Minimum Salary of Employee:- ");
	 
	 Employe Min=O.get(0);
	 for(i=0;i<O.size();i++)
	 {
		 Employe t=O.get(i);
		 if(t.salary<Min.salary)
		 {
			 Min=t;
		 }
	 }return Min;
 }

	 
	 ArrayList<Employe>increment(ArrayList<Employe>O,String name1,float Inc )
	 {
		 System.out.println("--------------------------------------------");
		 System.out.println("Increment Salary :- ");
		 System.out.println("--------------------------------------------");
		 for(int i=0;i<O.size();i++)
		 {
			 Employe t=O.get(i);
			 if(t.name==name1)
			 {
				 
			 
			
			 t.salary=(float)(t.salary+Inc*t.salary);
			 System.out.println(t.name+" "+t.salary);
			 }
		 
	 }return O;
	 
	 
	 }
		 float totalSal(ArrayList<Employe>O)
		 {
		 System.out.println("--------------------------------------------");
		 System.out.println("Total Salary of All Employee:- ");
		float sum=0;
		 for(int i=0;i<O.size();i++)
		 {
			Employe t=O.get(i);
		 sum=sum+t.salary;
	 }
	 return sum;
	 
	 

 }
}
