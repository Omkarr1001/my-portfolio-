package opps;
class Pen1
{
	String type,color;
	public void penDetail()
	{
		System.out.println("Color of pen is:-"+color);
		System.out.println("Type of pen is:-"+type);
		
	}
	
}

public class Oops {

	public static void main(String[] args) {
	
		
		Pen1 p1 = new Pen1();
		
		p1.color= "red";
		p1.type= "ballpen";
		
		p1.penDetail();
		
		
		Pen1 p2= new Pen1();
		p2.color="black";
		p2.type="gel";
		
		p2.penDetail();
	
	}
	
		

}
