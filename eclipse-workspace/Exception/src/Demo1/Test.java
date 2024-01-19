package Demo1;
import java.io.IOException;
public class Test {
	
	public void divide()
	{
		int x,y,z;
		try
		{
			x=5;
			y=0;
			z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e)
		{
		
			System.out.println(e);
			System.out.println(e.getCause());
			System.out.println("cannot dibvided by zero");
		}
		
	}
	

}
