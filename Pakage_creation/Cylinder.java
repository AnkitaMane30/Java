package dkte.goemetry.dim3;

public class Cylinder {
	private double radius;
	private double height;
	
	public Cylinder(double r,double h)
	{
		this.radius=r;
		this.height=h;		
	}
	public double calcArea()
	{
		return 2*3.142*this.radius*this.height;
	}

}
