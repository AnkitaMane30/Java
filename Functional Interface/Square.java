package Demo1.dkte;

public class Square implements Shape{
	private double side;
	public Square()
	{
		
	}
	public Square(double side)
	{
		this.side=side;
	}
	@Override
	public double calcArea() {
		return side*side;
	}

}
