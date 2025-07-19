//inheritance
package com.dkte;

public class Person {
	private String name;
	private int age;
	public Person()
	{
		System.out.println("public Person()");
	}
	public Person(String name,int age)
	{
		System.out.println("public Person(String name,int age)");
		this.name=name;
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void display()
	{
		System.out.printf("Name: %s\t Age:%d\n",this.name,this.age);
	}
}
