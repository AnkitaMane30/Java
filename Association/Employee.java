//Association
package com.dkte;
import java.util.Scanner;
public class Employee {
	private String name;
	private int id;
	private double salary;
	private Date Joinning;//association
	public Employee()
	{
		this.name="";
		this.id=0;
		this.salary=0.0;
		this.Joinning=new Date();
	}
	public Employee(String name,int id,double salary,Date joinning)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.Joinning=joinning;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoining() {
		return Joinning;
	}
	public void setJoining(Date joinning) {
		this.Joinning = joinning;
	}
	public void accept( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		name = sc.nextLine();  
		System.out.print("Id : ");
		id = sc.nextInt(); 
		System.out.print("Salary : ");
		salary = sc.nextDouble(); 
		System.out.println("Enter the date : ");
		this.Joinning.accept();
	}
	public void display( ) {
		System.out.printf("Id : %d\nName : %s\nSalary : %.2f\n",this.id,this.name,this.salary);
		this.Joinning.print();
	}
}
