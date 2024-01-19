package Demo1;



public class Main3 {
	public static void main(String[] args) {
		Bookstore[] b;
		b=new Bookstore[5];
		
		for(int i=0;i<5;i++)
		{
			b[i]=new Bookstore();
			
		}
		for(int i=0;i<5;i++)
		{
		b[i].getdata()	;
		b[i].disp();
		}
		
	}

}
