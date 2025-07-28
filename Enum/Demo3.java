package com.dkte;
import java.util.*;
enum Arithmetic
{
	Exit,ADD,SUB,MUL,DIV
}
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Two Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result;
		Arithmetic[] ar=Arithmetic.values();
		for(Arithmetic a:ar) {
			System.out.println(a.ordinal()+"."+a.name());
			
		}
		System.out.println("Enter your choice:");
		int index=sc.nextInt();
		Arithmetic choice=ar[index];
		switch(choice)
		{
		case ADD:
			result=n1+n2;
			System.out.println(result);
			break;
		case SUB:
			result=n1-n2;
			System.out.println(result);
			break;
		case MUL:
			result=n1*n2;
			System.out.println(result);
			break;
		case DIV:
			result=n1/n2;
			System.out.println(result);
			break;
		default:
			break;
			
		}
		sc.close();
	}

}
