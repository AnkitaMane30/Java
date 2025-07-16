//Static field and method
package com.dkte;

public class chair {
private int height,weight;
private static double price=500;

	public chair()
	{
		
	}
	public chair(int h,int w)
	{
		this.height=h;
		this.weight=w;
	}
	public static void setPrice(double p)
	{
		chair.price=p;
	}
	public static double getPrice()
	{
		return chair.price;
	}
	public void display()
	{
		System.out.printf("Height: %d Weight: %d Price:%.2f\n",this.height,this.weight,chair.price);
	}
}
