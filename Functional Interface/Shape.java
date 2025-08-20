//Function InterFace
package Demo1.dkte;

public interface Shape {
	double PI=3.1;
	double calcArea();//The Interface contains one abstract method this interface is functional interface
	
	public static double totalCalcArea(Shape[] arr)
	{
		double total=0.0;
		for(int i=0;i<arr.length;i++)
		{
			total=total + arr[i].calcArea();
		}
		return total;
	}
	default double calcPeri()
	{
		return 0.0;
	}

}
