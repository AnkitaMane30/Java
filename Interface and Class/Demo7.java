package com.dkte;

public class Demo7 {

	public static void main(String[] args) {
		Shape rect=new Rectangle(10,20);
		System.out.println("Area:"+rect.calcArea());
		System.out.println("Peri:"+rect.calcPeri());
		
		Shape c=new Circle(20);
		System.out.println("Area:"+c.calcArea());
		System.out.println("Peri:"+c.calcPeri());
		
		Shape s=new Square(30);
		System.out.println("Area:"+s.calcArea());
		System.out.println("Peri:"+s.calcPeri());
		

	}

}
