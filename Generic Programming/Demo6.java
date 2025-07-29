package com.dkte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

//Generic Programming //generic programming -- Java 5.0 or above
class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	} 
}
public class Demo6 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>( ); 	
		b1.setObj(new Integer(11));
		Integer r1 = b1.getObj(); 
		System.out.println("r1 : "+r1);
		
		Box<Date> b2 = new Box<Date>(); 
		b2.setObj(new Date());
		Date r2 = b2.getObj(); 
		System.out.println("r2 : "+r2);
		
		Box<Double> b3 = new Box<Double>(); 
		b3.setObj(new Double(11.33));
		Double r3 = b3.getObj(); 
		System.out.println("r3 : "+r3);
		
		Box<Integer> b4 = new Box<Integer>(); 
		//b4.setObj("123"); // Type checking at compile time 
		b4.setObj(new Integer(111));
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(10); 
		list.add(20); 
		list.add(30); 
		list.add(40); 
		//list.add("90")
		
		for(Integer ele : list) {
			System.out.println(ele);
		}
	}

}
