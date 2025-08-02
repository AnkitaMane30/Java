package com.dkte;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {
		Product[] arr = {
				new Product(3, "Pen", 11.33),
				new Product(4, "Pencil", 5.10),
				new Product(1, "Erasor", 6.66),
				new Product(5, "Sharpner", 7.33),
				new Product(2, "Book", 20.00)
		}; 
		Arrays.sort(arr);
		System.out.println("Sort by Id");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	Product2[] arr = {
				new Product2(3, "Pen", 11.33),
				new Product2(4, "Pencil", 5.10),
				new Product2(1, "Erasor", 6.66),
				new Product2(5, "Sharpner", 7.33),
				new Product2(2, "Book", 20.00)
		}; 
		Arrays.sort(arr);
		System.out.println("Sort by Name:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		Product3[] arr = {
				new Product3(3, "Pen", 11.33),
				new Product3(4, "Pencil", 5.10),
				new Product3(1, "Erasor", 6.66),
				new Product3(5, "Sharpner", 7.33),
				new Product3(2, "Book", 20.00)
		}; 
		Arrays.sort(arr);
		System.out.println("Sort by Price:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
