package demo1;


public class Encapsulation1 {
	private int age;					// by making instance variable is private 
										// access the instance variable using public setter and getter method
	
	public void setAge(int age)  //if the variable is private that variable is not accessible outside the class to access this variable data outside of class we proivde indirect access through public setter and getter method 
	{
		if(age>0)
		{
			
			System.out.println("age is allowed ");
			this.age=age;
		}
		else
		{
			System.out.println("Age is not allowed ");
		}
	}
		public int getAge()			// 
		
		{
			return this.age;
		}
	}


//with the help of setter method used to control 
