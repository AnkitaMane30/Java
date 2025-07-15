//Array Of Object
package com.dkte;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human[] h1=new Human[4];
		h1[0]=new Human(20,40,120);
		h1[1]=new Human(20,40,120);
		h1[2]=new Human(20,40,120);
		h1[3]=new Human(20,40,120);
		
		for(int i=0;i<h1.length;i++)
		{
			h1[i].display();
		}
	}

}
