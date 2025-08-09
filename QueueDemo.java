package Demo5.dkte;
import java.util.*;

public class QueueDemo {

	public static void main1(String[] args) {
		//Queue<String> q=new ArrayDeque<String>();
		Queue<String> q=new LinkedList<String>();
		q.offer("one");
		q.offer("two");
		q.offer("three");
		q.offer("four");
		q.offer("five");
		System.out.println(q.peek());
		if(!q.isEmpty())
		{
			String ele=q.poll();
			System.out.println(ele);
		}
		System.out.println(q.peek());
	}
	public static void main(String[] args) {
		//Queue<String> q=new ArrayDeque<String>();
				Queue<String> q=new LinkedList<String>();
				q.add("one");
				q.add("two");
				q.add("three");
				q.add("four");
				q.add("five");
				System.out.println(q.peek());
				if(!q.isEmpty())
				{
					String ele=q.remove();
					System.out.println(ele);
				}
				System.out.println(q.peek());
				q.removeAll(q);
				//q.remove(); gives Exception
	}
	

}
