package Demo8.dkte;
import java.util.*;
public class PriorityQueueDemo{

	public static void main1(String[] args) {
		Queue<String> q = new PriorityQueue<String>( ); 
		//(Elements are retrieved as per priority -- decided by Comparable (Natural Ordering)
		
		q.offer("D"); 
		q.offer("K");
		q.offer("T");
		q.offer("E"); 
		
		while(!q.isEmpty()) {
			String ele = q.poll(); 
			System.out.println(ele);
		}

	}
	public static void main(String[] args) {
		class StringDescComparator implements Comparator<String>{

			@Override
			public int compare(String x, String y) {
				int diff = y.compareTo(x); 
				return diff; 
			}
			
		}
		
		Queue<String> q = new PriorityQueue<String>(new StringDescComparator());
		q.offer("D"); 
		q.offer("K");
		q.offer("T");
		q.offer("E"); 
		
		while(!q.isEmpty()) {
			String ele = q.poll(); 
			System.out.println(ele);
		}
	}

}
