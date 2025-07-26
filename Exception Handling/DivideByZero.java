package com.dkte;
import java.util.*;
public class DivideByZero {

	public static int divide(int num, int den){
		int res = num / den; // divide operator may throw ArithmeticException
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt();
			int result = divide(num, den);
			System.out.println("Res : " + result);
		} catch (Throwable e) {
			//e.printStackTrace();
			System.out.println("Message : "+e.getMessage());
		} 

	}

}
