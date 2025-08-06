package demo2.dkte;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		List<Book>list=new ArrayList<Book>();
		Collections.addAll(list,  
				new Book(4, "The Alchemist", "Novel", 493.23),
			    new Book(1, "The Archer", "Novel", 723.53),
			    new Book(5, "The Fountainhead", "Novel", 652.73),
			    new Book(2, "Atlas Shrugged", "Novel", 872.94),
			    new Book(6, "Harry Potter", "Novel", 423.68),
			    new Book(3, "Lord of Rings", "Novel", 621.53)	
			    );
		for(Book b:list)
		{
			System.out.println(b);
		}
		System.out.println();
		//Get Random Access
		Book b=list.get(0);
		System.out.println(b);
		System.out.println();
		int id=5;
		Book key =new Book();
		key.setId(id);
		
		int idx=list.indexOf(key);
		if(idx!=-1)
		{
			Book bk=list.get(id);
			System.out.println(bk+" found at index "+idx);
		}
		else
		{
			System.out.println("Element not found:");
		}
		Collections.sort(list); //natural ordering 
		System.out.println("Sort on ID : ");
		for(Book bkk : list) {
			System.out.println(bkk);
		}
		
		class NameComparator implements Comparator<Book>
		{
			@Override
			public int compare(Book x, Book y) {
				int diff= x.getName().compareTo(y.getName());
				return diff;
			}	
		}
		System.out.println("Sort by Name:");
		Collections.sort(list,new NameComparator());
		for(Book bkk : list) {
			System.out.println(bkk);
		}
		
		class PriceComparator implements Comparator<Book>
		{
			@Override
			public int compare(Book x, Book y) {
				int diff=Double.compare(x.getPrice(),y.getPrice());
				return diff;
			}
			
		}
		System.out.println("Sort by price:");
		Collections.sort(list,new PriceComparator());
		for(Book bkk : list) {
			System.out.println(bkk);
		}
		System.out.println("Max price Book:");
		Book bk=Collections.max(list,new PriceComparator());
		System.out.println(bk);
	}
    

}
