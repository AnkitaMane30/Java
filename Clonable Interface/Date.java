package com.dkte;

public class Date implements Cloneable{
	private int day; 
	private int month; 
	private int year; 
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//this = dt1 
	//Creates and returns a copy of this object.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object temp = super.clone(); 
		return temp; 
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
