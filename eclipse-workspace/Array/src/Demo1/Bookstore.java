package Demo1;
import java.util.Scanner;
public class Bookstore 
{
	int id;
	String name;
	float price;
	String Auther;
	String Category;
	Scanner sc=new Scanner(System.in);
	
	void getdata()
	{
		System.out.println("\nEnter id,name,price Auther and Category :");
		id=sc.nextInt();
		name=sc.next();
		price=sc.nextFloat();
		Auther=sc.next();
		Category=sc.next();
	}
	
	void disp()
	{
		System.out.println("\nBookid:-"+id);
		System.out.println("\nBookname:-"+name);
		System.out.println("\nBoookPrice:-"+price);
		System.out.println("\nBookAuther:-"+Auther);
		System.out.println("\nBookCategory:-"+Category);
		
		
		
	}
}



