package com.dkte;
import java.util.*;

public class Demo5 {

	/* 
	//handling the possible errors -- programmatically
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the numerator : ");
		int num = sc.nextInt(); 
		System.out.print("Enter the denominator : ");
		int den = sc.nextInt(); 
		if(den!=0) {
			int res = num / den; 
			System.out.println("res : "+res);
		}
		else 
			System.out.println("Divide by zero");
	}*/ 
	/* 
	//handling the possible errors -- programmatically
	public static int divide(int num , int den) {
		if(den == 0) {
			System.exit(0);
		}
		int res = num / den; 
		return res; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the numerator : ");
		int num = sc.nextInt(); 
		System.out.print("Enter the denominator : ");
		int den = sc.nextInt(); 
		int result = divide(num,den);  
		System.out.println("Res : "+result);
	}*/ 
	
	
	/* 
	//detect the problem and throw the problem
	public static int divide(int num , int den) {
		if(den == 0) {
			throw new RuntimeException("Divide by zero"); 
		}
		int res = num / den; 
		return res; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt(); 
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt(); 
			int result = divide(num,den);  
			System.out.println("Res : "+result);
		}
		catch (RuntimeException e) {
			System.out.println("Divide by zero ");
		}
	}*/ 
	//CODE 
		
	/* 
	//detect the problem and throw the problem
		public static int divide(int num , int den) {
			int res = num / den; //divide operator may throw Arithmetic Exception 
			return res; 
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			try {
				System.out.print("Enter the numerator : ");
				int num = sc.nextInt(); 
				System.out.print("Enter the denominator : ");
				int den = sc.nextInt(); 
				int result = divide(num,den);  
				System.out.println("Res : "+result);
			}
			catch (ArithmeticException e) {
				System.out.println("Divide by zero ");
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid I/p");
			}
		}
	*/
	/* 
	//detect the problem and throw the problem
	public static int divide(int num, int den) {
		int res = num / den; // divide operator may throw Arithmetic Exception
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
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Invalid I/P ");
		} finally {
			sc.close(); // resource closed
		}

	}*/
	
	//detect the problem and throw the problem as checked exception 
		public static int divide(int num, int den) throws Exception {
			int res = num / den; // divide operator may throw Arithmetic Exception
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
			} catch (Exception e) {
				System.out.println("Invalid I/P ");
			} 

		}

}
