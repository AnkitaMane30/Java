package com.app.fruits;
import java.util.*;
public class FruitBasket {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basket size:");
		int size=sc.nextInt();
		Fruits [] basket=new Fruits[size];
		int counter=0;
		boolean exit=false;
		while(!exit)
		{
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display All Name");
		System.out.println("5.Display Properties of Fruits in Basket");
		System.out.println("6.Mark Fruit as stale");
		System.out.println("7.Display taste of all stale fruits in basket");
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 0:
			 exit=true;
			break;
		case 1:
			if(counter<basket.length)
			{
				System.out.println("Enter Name,Color,weight");
				
				String nm=sc.next();
				String color=sc.next();
				double wgt=sc.nextDouble();
				basket[counter++]=new Mango(nm,color,wgt);
			}
			else
			{
				System.out.println("Basket is Full!");
			}
			break;
		case 2:
			if(counter<basket.length)
			{
				System.out.println("Enter Name,Color,weight");
				String nm=sc.next();
				String color=sc.next();
				double wgt=sc.nextDouble();
				basket[counter++]=new Orange(nm,color,wgt);
			}
			else
			{
				System.out.println("Basket is Full!");
			}
			break;
		case 3:
			if(counter<basket.length)
			{
				System.out.println("Enter Name,Color,weight");
				String nm=sc.next();
				String color=sc.next();
				double wgt=sc.nextDouble();
				basket[counter++]=new Apple(nm,color,wgt);
			}
			else
			{
				System.out.println("Basket is Full!");
			}
			break;
		case 4:
			for(Fruits f:basket)
			{
				if(f!=null)
					System.out.println(f.getName());
			}
			break;
		case 5:
			for(Fruits f:basket)
			{
				if(f!=null && f.isFresh())
				{
					System.out.println(f.toString()+",Taste:"+f.taste());
				}
			}
			break;
		case 6:
			System.out.println("Enter Index:");
			int idx=sc.nextInt();
			if(idx>=0 && idx<counter && basket[idx]!=null)
			{
				basket[idx].setFresh(false);
				System.out.println("Marked fruit at index"+ idx +"as stale");
			}else
			{
				System.out.println("Invalid index");
			}
			break;
		case 7:
			System.out.println("Tastes :");
			for(Fruits f:basket)
			{
				if(f!=null && !f.isFresh())
				{
					System.out.println(f.getName()+":"+f.taste());
				}
			}
			break;
			default:
				System.out.println("invalid");
			
		}
		System.out.println();
	}
		sc.close();
	}

}
