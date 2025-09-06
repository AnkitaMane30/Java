package com.dkte;
import java.util.*;
class Invoice{
	private String partNumber;
	private String partDesc;
	private int quantity;
	private double price;
	public Invoice() {
		// TODO Auto-generated method stub

	}
	public Invoice(String partNumber,String partDesc,int quantity,double price)
	{
		this.partNumber=partNumber;
		this.partDesc=partDesc;
		this.quantity=quantity;
		this.price=price;
	}
	public void setPartNumber(String partNumber)
	{
		this.partNumber=partNumber;
	}
	public String getPartNumbre()
	{
		return partNumber;
	}
	public void setPartDesc(String partDesc)
	{
		this.partDesc=partDesc;
	}
	public String getPartDesc()
	{
		return partDesc;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	} 
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	//Calculate Price
	public double calcPrice(int quantity,double Price)
	{
		return this.quantity*this.price;
	}
	
}
class InvoiceTest{
	Invoice i=new Invoice();
	Scanner sc=new Scanner(System.in);
	
	public void acceptRecord()
	{
		System.out.println("Enter Part Number:");
		i.setPartNumber(sc.nextLine());
		
		System.out.println("Enter Part Description:");
		i.setPartDesc(sc.nextLine());
		
		System.out.println("Enter Quantity:");
		int x= sc.nextInt();
		if(x<0)
		{
			i.setQuantity(0);
		}
		else
		{
			i.setQuantity(x);
		}
		
		System.out.println("Enter price: ");
		double y=sc.nextDouble();
		if(y<0) {
			i.setPrice(0.0);
		}
		else {
			i.setPrice(y);
		}
	}
	
	public void printRecord()
	{
		System.out.printf("Part Number:%s \tPart Description:%s \tQuantity:%d \tPrice:%.2f\n",i.getPartNumbre(),i.getPartDesc(),i.getQuantity(),i.getPrice());
		System.out.println("Price of Items:"+i.calcPrice(i.getQuantity(),i.getPrice()));
	}
}
public class InvoiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceTest i1=new InvoiceTest();
		i1.acceptRecord();
		i1.printRecord();
	}

}
