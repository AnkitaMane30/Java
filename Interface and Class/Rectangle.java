package com.dkte;

public class Rectangle implements Shape {
	private double length;
	private double breadth;
	public Rectangle() {
		
	}
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double calcArea()
	{
		return this.length*this.breadth;
	}
	public double calcPeri()
	{
		return 2*(this.length + this.breadth);
	}
}
