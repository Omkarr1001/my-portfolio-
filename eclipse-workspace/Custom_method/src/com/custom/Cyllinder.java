package com.custom;

class Attribute
{
	private int radious;
	private int height;
	public Attribute(int radious,int height)
	{
		this.radious=radious;
		this.height=height;
	}
	public void setRadious(int radious)
	{
		this.radious=radious;
	}
	public int getRadious()
	{
		return radious;
	}
	public void setHeight(int height)
	{
		this.height=height;
		
	}
	public int getHeight()
	{
		return height;
	}
	public  void calculateArea()
	{
		double c=2*3.14d*radious*height+2*3.14d*radious*radious;
		System.out.println("Surface area of cylinder is:- "+c);
		
	}
	public void volume()
	{
		float c=3.14f*radious*radious*height;
		System.out.println(c);
	}
}

public class Cyllinder {
	public static void main(String[] args) {
		Attribute r=new Attribute(10,15);
		
		System.out.println(r.getRadious());
		System.out.println(r.getHeight());
		r.calculateArea();
		r.volume();
	}

}
