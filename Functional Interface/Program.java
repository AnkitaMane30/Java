package Demo1.dkte;

public class Program {

	public static void main(String[] args) {
		Shape [] arr= {
				new Circle(10.5),
				new Rectangle(20.5,40.6),
				new Square(30.5)
				};
		double totalArea=Shape.totalCalcArea(arr);
		System.out.println("Total of calculate Area:"+totalArea);

	}

}
