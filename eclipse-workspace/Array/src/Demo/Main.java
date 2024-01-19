package Demo;

public class Main {
	public static void main(String[] args) {
		
		
		Product p=new Product();
		p.id=1;
		p.name="pen";
		p.price= 15;
		
		Product p1=new Product();
		p1.id=2;
		p1.name="pencile";
		p1.price=10;
		Product p2=new Product();
	
		p2.id=3;
		p2.name="notebook";
		p2.price= 75;		
		
		
		Product p4[]=new Product[3];
		p4[0]=p;
		p4[1]=p1;  
		p4[2]=p2;
		
		System.out.println(p.id+" "+p.name+"  "+p.price);
		System.out.println(p1.id+" "+p1.name+"  "+p1.price);
		System.out.println(p2.id+" "+p2.name+"  "+p2.price);
		
		
	}
		
	}


