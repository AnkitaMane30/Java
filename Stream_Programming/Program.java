package Demo5.dkte;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Program {

	public static void main1(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		Stream<Integer> str=Arrays.stream(arr);
		str
		.forEach(e->System.out.print(e+" "));
	}
	public static void main2(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ankita");
		list.add("Vaishni");
		list.add("vibhute");
		list.add("siddhi");
		Stream<String> str=list.stream();
		str
		.map(word->word.toUpperCase())
		.forEach(e->System.out.print(e+" "));
		
	}
	public static void main3(String[] args) {
		String[] str= {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm=Stream.of(str);
		
		strm
		.filter(word->word.endsWith("a"))
		.forEach(e->System.out.print(e+" "));
	}
	public static void main4(String[] args) {
		String[] str= {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm=Stream.of(str);
		strm
		.sorted((x,y)->x.compareTo(y))
		.forEach(e->System.out.println(e));
	}
	public static void main5(String[] args) {
		String[] str= {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm=Stream.of(str);
		strm
		.skip(2)
		.limit(4)
		.forEach(e->System.out.println(e +""));
	}
	public static void main6(String[] args) {
		String[] str= {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
        Stream<String> strm=Stream.of(str);
        strm
        .distinct()
        .forEach(e->System.out.println(e));
	}
	public static void main(String[] args) {
		String[] str= {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
        Stream<String> strm=Stream.of(str);
        long cnt=strm
        .count();
        System.out.println(cnt);
        
        

	}

}
