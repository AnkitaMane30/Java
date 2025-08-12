package Demo1.dkte;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	//Set<String> set=new LinkedHashSet<String>();
	//Set<String> set=new TreeSet<String>();
	set.add("India");  //return true
	set.add("USA"); // return true
	set.add("China"); // return true
	set.add("Russia"); // return true
	set.add("India"); // return false
	set.add("Iran"); // return true
	set.add("China"); // return false
	set.add("Iraq");  // return true
	System.out.println("size:"+set.size());
	for(String s:set)
	{
		System.out.println(s);
	}
	}
}
