package dkte.goemetry.dim2;

public class Circle {
	private double radius;
	public Circle(double r) {
		this.radius=r;
	}
	
	public double calcArea()
	{
		return 3.142*this.radius*this.radius;
	}

}
