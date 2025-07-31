package clg.dkte;

public class GenericMethod {
	//generic methods using object till java 1.4
	public static void printObjectArray(Object[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	// generic method using generic type param -- since Java 5.0) 
	public static<T>void printTypedArray(T[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	//generic method using bounded generic type param -- since Java 5.0
	public static <T extends Number>void printNumberArray(T[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
	/*	Object[] obj= {10,12,56,34,"hello",30};
		printObjectArray(obj);
		
		String [] str= {"a","b","c","d","e"};
		printObjectArray(str);
*/
	/*	Object[] obj= {10,12,56,34,"hello",30};
		printTypedArray(obj);
		
		String [] str= {"a","b","c","d","e"};
		printTypedArray(str);
		
		Integer[] i= {10,20,30,40,50,60,70};
		printTypedArray(i);
		
		Double[] d= {40.2,30.2,40.5,613.582,425.2};
		printTypedArray(d);
		*/
		Integer[] i= {10,20,30,40,50,60,70};
		printNumberArray(i);
		
		Double[] d= {40.2,30.2,40.5,613.582,425.2};
		printNumberArray(d);
		
		String [] str= {"a","b","c","d","e"};
		//printNumberArray(str);not ok 
	}

}
