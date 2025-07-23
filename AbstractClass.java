package clg.dkte;
import java.util.*;
abstract class Shape{
	protected double area;
	public abstract void acceptRecord();
	public abstract void calcArea();
	 public void printRecord()
	 {
		 System.out.println("Area:"+this.area);
	 }
}
class Rectangle extends Shape{
	Scanner sc=new Scanner(System.in);
	private double length;
	private double breadth;
	public final void acceptRecord()
	{
		System.out.println("Enter Length:");
		length=sc.nextDouble();
		System.out.println("Enter Breadth:");
		breadth=sc.nextDouble();
	}
	public final void calcArea()
	{
		this.area=this.length*this.breadth;
	}
	
}
class Circle extends Shape{
	Scanner sc= new Scanner(System.in);
	private double radius;
	public final void acceptRecord()
	{
		System.out.println("Enter Radius:");
		radius=sc.nextDouble();
	}
	public final void calcArea()
	{
		this.area=(float)(Math.PI*this.radius*this.radius);
		
	}
}
public class AbstractClass {
	public static int menuList()
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		while((choice=menuList())!=0)
		{
			Shape shape=null;
			switch(choice)
			{
			case 1:
				shape=new Rectangle();
				break;
			case 2:
				shape=new Circle();
				break;
			default:
				System.out.println("Invalid Choice");
			}
			if(shape!=null)
			{
				shape.acceptRecord();
				shape.calcArea();
				shape.printRecord();
			}
		}
	}

}
