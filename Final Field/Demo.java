//Final field
package com.dkte;

public class Demo {

	public static void main(String[] args) {
		Circle c1=new Circle(3.1);
		c1.setRadius(4);
	
		System.out.println("Radius:"+c1.getRadius());
		System.out.println("Area of Circle:"+c1.calcArea());
		System.out.println("Perimeter of circle:"+c1.calcPeri());
		
		final Circle c2=new Circle(3.1);
		//c2=null; //we cannot modify reference is final 
		

	}

}
