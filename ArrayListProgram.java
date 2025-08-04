package clg.dkte;
import java.util.*;
public class ArrayListProgram {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("Iran");
		list.add("Iraq");
		list.add("India");
		list.add("Germany");
		list.add("Denmark"); 
		
		System.out.println("Size of List:"+list.size());
		System.out.println(list);
		
		int index=3;
		list.add(index,"Finland");
		System.out.println(list);
		String str=list.get(5);
		System.out.println("Get:"+str);
		System.out.println("Set:"+list.set(4, "USE"));
		System.out.println(list);
		str=str.toUpperCase();
		System.out.println(str);
		
		list.remove(index);
		System.out.println(list);
		
		String find="India";
		boolean found=list.contains(find);
		if(found)
			System.out.println(find+" found");
		else
			System.out.println("Not found");
		
		int idx=list.indexOf(find);
		if(idx!=-1)
			System.out.println(find+" found at index "+idx);
		else
			System.out.println("Element not Found");
		
		idx=list.lastIndexOf(find);
		if(idx!=-1)
			System.out.println(find+" found at index "+idx);
		else
			System.out.println("Element not Found");
		Iterator<String> trav=list.iterator();
		while(trav.hasNext())
		{
			String ele=trav.next();
			System.out.print(ele+" ");
		}
		list.clear();
		System.out.println(list);
		
		//Helper class Collection
		Collections.addAll(list,"B","V","A","R","C");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		class StringComparator implements Comparator<String>
		{
			@Override
			public int compare(String x, String y) {
				int diff=-x.compareTo(y);
				return diff;
			}
			
		}
		Collections.sort(list, new StringComparator());
		System.out.println(list);
	}

}
