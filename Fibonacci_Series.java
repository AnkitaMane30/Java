
public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=0;
      int b=1;
      System.out.println(a);
      System.out.println(b);
      for(int i=1;i<=10;i++)
      {
    	  int c=b+a;
    	  System.out.println(c);
    	  a=b;
    	  b=c;
      }
	}

}
