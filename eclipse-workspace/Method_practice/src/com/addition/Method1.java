package com.addition;

public class Method1 {
	  int add(int x,int y)
	{
		int c=x+y;
		 return c;
	}
  static void changeArray(int []arr)
  {
	  arr[0]=111;
  }
  static void tellJoke()
  {
	  System.out.println("Joke hahahahahah");
  }
    
    public static void main(String arg[])
    {
    	int a=10;
    	int b=20;
    	int c;
    	Method1 z=new Method1();
    	
    	c=z.add( a,b);
    	
    	System.out.println(c);
    	
    	int arry[]= {10,23,42,14,22};
    	tellJoke();
    	changeArray(arry);
    	System.out.println(arry[0]);
    	
    	
    }
    
    
}
