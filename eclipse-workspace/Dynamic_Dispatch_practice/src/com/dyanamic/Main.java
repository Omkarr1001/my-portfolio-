package com.dyanamic;
class Phone 
{
	public void showTime()
	{
		System.out.println("Time is 8 am");
		
	}
	public void on()
	{
		System.out.println("Turning on Phone");
	}
}
class SmartPhone extends Phone
{
	public void music()
	{
		System.out.println("Playing Music ");
	
	}
	public void on()
	{
		System.out.println("Turning on SmartPhone");
	}
}

public class Main {
	public static void main(String[] args) {
		Phone obj=new SmartPhone();
		obj.on();
		obj.showTime();
				
	}

}
