package Demo3;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>( ); 
		Collections.addAll(set,"A","B","C","D","E","F","G","H","I","J"); 
		
		System.out.println(set);
		System.out.println("First"+set.first());
		System.out.println("Last:"+set.last());
		System.out.println("Headset:"+set.headSet("E"));
		System.out.println("Tailset:"+set.tailSet("F"));
		System.out.println("Higher:"+set.higher("A"));
		System.out.println("Lower:"+set.lower("G"));
		
		NavigableSet<String> decs=set.descendingSet();
		System.out.println("descending:");
		for(String s:decs)
		{
			System.out.print(s+" ");
		}
	}

}
