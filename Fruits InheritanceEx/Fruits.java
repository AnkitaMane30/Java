package com.app.fruits;

public class Fruits {
	
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruits(String name,String color,double weight) {
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.isFresh=true;
	}
	public String toString()
	{
		return "name:"+ name  +"Color: "+ color  +" Weight: "+weight;
	}
	public String taste()
	{
		return "No specific Taste";
	}
	public boolean isFresh()
	{
		return isFresh;
	}
	public void setFresh(boolean isFresh)
	{
		this.isFresh=isFresh;	
	}
	public String getName()
	{
		return name;
	}
	public String getColor()

	{
		return color;
	}
	public double getWeight()

	{
		return weight;
	}
}
