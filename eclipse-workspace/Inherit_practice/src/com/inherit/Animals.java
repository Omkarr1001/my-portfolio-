package com.inherit;

class Dog
{
  public String color;
  public String year;
  public String bread;
  public String sound;
  
  
public Dog(String color, String year, String bread, String sound) {
	
	this.color = color;
	this.year = year;
	this.bread = bread;
	this.sound = sound;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getBread() {
	return bread;
}
public void setBread(String bread) {
	this.bread = bread;
}
public String getSound() {
	return sound;
}
public void setSound(String sound) {
	this.sound = sound;
}
  public void printDetail()
  {
	  System.out.println("Color of Dog is "+color);
	  System.out.println("Year of Dog is "+year);
	  System.out.println("Bread of Dog is "+bread);
	  System.out.println("Sound Of Dog is "+sound);
  }
  
  
}
public class Animals extends Dog {
	public Animals(String color, String year, String bread, String sound) {
		super(color, year, bread, sound);
	}

	public static void main(String[] args) {
		Animals dog=new Animals("White-Black","3","Pumelion","Bhao-bhao-bhao");
		dog.printDetail();
	}

}
