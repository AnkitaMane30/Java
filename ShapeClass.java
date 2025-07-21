package clg.dkte;
import java.util.*;
class Shape{
	protected double area;
	public void acceptRecord()
	{
		
	}
	public void clacArea()
	{
		
	}
	public void printRecord()
	{
		System.out.println("Area:"+this.area);
	}
	
}
class Rectangle extends Shape
{
	Scanner sc=new Scanner(System.in);
	private double length;
	private double breadth;
	public Rectangle()
	{
		
	}
	public void acceptRecord()
	{
		System.out.println("Enter Length:");
		length=sc.nextDouble();
		System.out.println("Enter Breadth:");
		breadth=sc.nextDouble();
	}
	public void clacArea()
	{
		this.area=this.length*this.breadth;
	}	
}
class Circle extends Shape{
	Scanner sc=new Scanner(System.in);
	private double radius;
	public Circle(){
		
	}
	public void acceptRecord()
	{
		System.out.println("Enter Radius:");
		radius=sc.nextDouble();
	}
	public void clacArea()
	{
		this.area=(float)(Math.PI*this.radius*this.radius);
	}
	
}
public class ShapeClass {
	public static int menuList()
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Rectangle:");
		System.out.println("2.Circle:");
		System.out.println("Enter choice:");
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
			System.out.println("Invalid choice");
			break;	
		}
		if(shape!=null)
		{
			shape.acceptRecord();
			shape.clacArea();
			shape.printRecord();
		}
	}

}
}
