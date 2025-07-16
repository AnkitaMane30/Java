//Static field and method
package com.dkte;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chair c1=new chair(10,20);
		chair c2=new chair(20,40);
		c1.display();
		c2.display();
		
		chair.setPrice(1000);
		System.out.println("updated chair price "+chair.getPrice());
		
		c1.display();
		c2.display();
		
	}

}
