package demo6;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		while(!st.isEmpty())
		{
			Integer ele=st.pop();
			System.out.println(ele);
		}

	}

}
