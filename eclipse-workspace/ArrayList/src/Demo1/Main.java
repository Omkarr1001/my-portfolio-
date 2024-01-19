package Demo1;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		//Employee e4=new Employee();
		//Employee e5=new Employee();
		
		e1.getdata();
		e2.getdata();
		e3.getdata();
		//e4.getdata();
		//e5.getdata();
		ArrayList<Employee>  a=new  ArrayList<Employee> ();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		//a.add(e4);
		//a.add(e5);
		
		System.out.println(" Employee table");
		for(int i=0;i<a.size();i++)
		{
			Employee t=a.get(i);
			
		
		
			System.out.println(t.id+" "+t.name+" "+t.Role+" "+t.Salary);
			
		}
		
		
		
		System.out.println("Salary  is more than 50,000:-");
		for(int i=0;i<a.size();i++)
		{
	Employee t=a.get(i);
	if(t.Salary>=50000)
	{
		System.out.println(t.name+" "+t.Salary);
	}
			
	
		}
		
		
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Average Salary is:-");
		int sum=0;
		int r=0;
		for(int i=0;i<a.size();i++)
		{
			Employee t=a.get(i);
			sum=sum+t.Salary;
			r=sum/a.size();
		}
		System.out.println(r);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("list of Manager  ");
		for(int i=0;i<a.size();i++)
		{
			Employee t5=a.get(i);
			if(t5.Role.equals("Manager"))
			{
				System.out.println(t5.name+ "");
			}
		}
		
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Count Of Manger is ");
		int count=0;
		for(int i=0;i<a.size();i++)
		{
			Employee t=a.get(i);
			if(t.Role.equals("Manager"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
	
		
		
	}

}

