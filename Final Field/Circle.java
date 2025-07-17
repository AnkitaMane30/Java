//Final Field
package com.dkte;

public class Circle {
	private double radius;
	private final double PI=3.1;//field Initializer
	{
		//PI=3.1; //object Initializer
	}
	public Circle(){
		//PI=3.1;//constructor Initializer
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getPI()
	{
		return PI;
	}
	public double calcArea()
	{
		return PI*this.radius*this.radius;
	}
	public double calcPeri()
	{
		return 2*PI*this.radius;
	}
}
