package dkte.goemetry.dim3;

public class Box {
	private double width;
	private double height;
	private double breadth;
	
	public Box(double w, double h,double b)
	{
		this.width=w;
		this.height=h;
		this.breadth=b;
		
	}
	public double calcVolume() {
		return this.width*this.height*this.breadth;
	}
}
