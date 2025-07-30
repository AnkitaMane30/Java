package clg.dkte;
import java.util.*;
class Box<T extends Number>
{
	private T obj;
	public T getObj()
	{
		return obj;
	}
	public void setObj(T obj)
	{
		this.obj=obj;
		
	}
}
public class GenericClass {

	public static void main(String[] args) {
		Box<Integer> b=new Box<Integer>();
		b.setObj(new Integer(11));
		Integer r1=b.getObj();
		System.out.println(r1);
		
	//	Box<String> b2=new Box<String>();//Not ok because string is not a sub class of number
		Box<Double> b2=new Box<Double>();
		b2.setObj(new Double(11));
		Double r2=b2.getObj();
		System.out.println(r1);
		
	//	Box<Date> d3=new Box<Date>();not ok date is not subclass of number
	//	Box<Object> b3=new Box<Object>();object is not subclass of number it is super class 
		Box<Integer> b5=new Box<Integer>();
		b5.setObj(new Integer("11"));
		//b5.setObj("11");string not allowed
		Integer r=b.getObj();
		System.out.println(r);

	}

}
