package Demo7.dkte;
import java.util.*;
public class DequeDemo {

	public static void main1(String[] args) {
		Deque<Integer> q=new ArrayDeque<Integer>();//Deque as stack
		q.offerFirst(10);
		q.offerFirst(20);
		q.offerFirst(30);
		q.offerFirst(40);
		q.offerFirst(50);
		while(!q.isEmpty())
		{
			Integer ele=q.pollFirst();
			System.out.println(ele);
		}

	}
	public static void main(String[] args) {
		Deque<Integer> q=new ArrayDeque<Integer>();//Deque as stack
		q.offerLast(10);
		q.offerLast(20);
		q.offerLast(30);
		q.offerLast(40);
		q.offerLast(50);
		while(!q.isEmpty())
		{
			Integer ele=q.pollFirst();
			System.out.println(ele);
		}
	}

}
