package Demo1.dkte;

public class Rectangle implements Shape {
	private double length;
	private double breadth;
	public Rectangle()
	{
		
	}
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double calcArea() {
		
		return length*breadth;
	}
}
