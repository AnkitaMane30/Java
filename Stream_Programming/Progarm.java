package Demo4;
import java.util.*;
import java.util.stream.Stream;
public class Progarm {
	public static void main1(String[] args) {
		//Input : 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 
		//step1 : Square of each number : 1 , 4 , 9 , 16 , 25 , 36 , 49 , 64 , 81 , 100 
		//step2 : get all odd numbers : 1 , 9 , 25 , 49 , 81 
		//step3 : append "java" :  "java1" , "java9" , "java25" , "java49" , "java81"
		// print each element 
		Stream.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 )
		 .map(n->n*n)
		 .filter(n-> n%2!=0)
		 .map(n->"java"+n)
		 .forEach(n->System.out.println(n));
	}
	public static void main2(String[] args) {
		Stream<Integer> str1=Stream.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10);
		Stream<Integer> str2=str1.map(n-> n * n);
		Stream<Integer> str3=str2.filter(n-> n % 2!=0);
		Stream<String> str4=str3.map(n->"java"+n);
		str4.forEach(n->System.out.println(n));	
	}
	public static void main(String[] args) {
		Stream.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10)
		.map(n->{
		System.out.println("map()"+n);
		return n*n;
		})
		.filter(n->{
			System.out.println("filter()"+n);
			return n%2!=0;
		})
		.map(n->{
			System.out.println("Map()"+n);
			return "java"+n;
		})
		.forEach(e->System.out.println(e));
	}

}
