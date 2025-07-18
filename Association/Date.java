//Association
package com.dkte;
import java.util.*;
public class Date {
	private int day;
	private int month;
	private int year;
	public Date()
	{
		this(1,2,2005);
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		day=sc.nextInt();
		System.out.println("Enter Month:");
		month=sc.nextInt();
		System.out.println("Enter Year:");
		year=sc.nextInt();
	}
	public void print()
	{
		System.out.printf("Date: %d-%d-%d\n",this.day,this.month,this.year);
	}
}
