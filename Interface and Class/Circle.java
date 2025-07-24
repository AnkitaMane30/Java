package com.dkte;

public class Circle implements Shape {
	private double radius;
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double calcArea()
	{
		return PI* this.radius*this.radius;
	}
	public double calcPeri()
	{
		return PI*this.radius*2;
	}
}
