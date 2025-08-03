package comm.dkte;
import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		Product[ ] arr = {
				new Product(3, "Pen", 11.33),
				new Product(4, "Pencil", 5.10),
				new Product(1, "Erasor", 6.66),
				new Product(5, "Sharpner", 7.33),
				new Product(2, "Book", 20.00)
		}; 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("sort By Id:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		class NameComparator implements Comparator<Product>
		{
			@Override
			public int compare(Product o1, Product o2) {
				int diff=o1.getName().compareTo(o2.getName());
				return diff;
			}	
		}
		Arrays.sort(arr,new NameComparator() );
		System.out.println("sort By Name:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		class PriceascendingComparator implements Comparator<Product>
		{
			@Override
			public int compare(Product o1, Product o2) {
				int diff=(int)(o1.getPrice()-o2.getPrice());
				return diff;
			}
			
		}
		Arrays.sort(arr,new PriceascendingComparator());
		System.out.println("sort By Price In ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		class PricedescendingComparator implements Comparator<Product>
		{
			@Override
			public int compare(Product o1, Product o2) {
				int diff=(int)(o2.getPrice()-o1.getPrice());
				return diff;
			}
			
		}
		Arrays.sort(arr,new PricedescendingComparator());
		System.out.println("sort By Price In Descending order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
