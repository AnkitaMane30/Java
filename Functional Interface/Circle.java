package Demo1.dkte;

public class Circle implements Shape{
	private double radius;
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	public double calcArea() {
	
		return PI*radius*radius;
	}
	

}
