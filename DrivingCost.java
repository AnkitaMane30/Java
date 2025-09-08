package com.dkte;
import java.util.*;
class Cost{
	private double miles;
	private double costOfGallon;
	private double average;
	private double parkingFee;
	private double toll;
	private double costOfFuel;
	private double costPerDay;
	public Cost(){
		
	}
	public void setMiles(double miles)
	{
		this.miles=miles; 
	}
	public double getMiles()
	{
		return miles;
	}
	public void setcostOfGallon(double costOfGallon)
	{
		this.costOfGallon=costOfGallon;
	}
	public double getcostOfGallon()
	{
		return costOfGallon;
	}
	public double getAverage()
	{
		this.average=miles/costOfGallon;
		return average;
	}
	public void setParkingFee(double parkingFee)
	{
		this.parkingFee=parkingFee;
	}
	public double getParkingFee()
	{
		return parkingFee;
	}
	public void setToll(double toll)
	{
		this.toll=toll;
	}
	public double getToll()
	{
		return toll;
	}
	public double totalCost()
	{
		costOfFuel=(miles/average)*costOfGallon;
		costPerDay=costOfFuel+parkingFee+toll;
		return costPerDay ;
	}
}
public class DrivingCost {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cost c=new Cost();
		
		System.out.println("Enter Total miles driven per day:");
		c.setMiles(sc.nextDouble());
		
		System.out.println("Enter cost per gallon of gasoline:");
		c.setcostOfGallon(sc.nextDouble());
		
		System.out.println("enter Parking Fee:");
		c.setParkingFee(sc.nextDouble());
		
		System.out.println("Enter toll per day:");
		c.setToll(sc.nextDouble());
		
		System.out.printf("Mile: %.2f\n Cost of Gallon%.2f\n Average Mile per gallon:%.2f\n Parking Fee:%.2f\n Toll per day:%.2f\n ",c.getMiles(),c.getcostOfGallon(),c.getAverage(),c.getParkingFee(),c.getToll());
		System.out.println("Total cost Per Day of Driving"+c.totalCost());

		sc.close();
	}
	

}
