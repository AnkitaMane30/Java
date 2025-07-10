package dkte.goemetry;
import dkte.goemetry.dim2.*;
import dkte.goemetry.dim3.*;
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(2.6);
		System.out.println("Area of Circle:"+c.calcArea());
		
		Box b=new Box(3.4,5.6,4.2);
		System.out.println("Volume of Box:"+b.calcVolume());
		
		Cylinder c2= new Cylinder(4,5.7);
		System.out.println("Area of Cylinder"+c2.calcArea());
					
	}

}
