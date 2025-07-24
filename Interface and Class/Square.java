package com.dkte;

public class Square implements Shape {
	private double side;
	public Square() {
		
	}
	public Square(double side)
	{
		this.side=side;
	}
	public double calcArea()
	{
		return this.side*this.side;
	}
	public double calcPeri()
	{
		return 4*this.side;
	}


}
