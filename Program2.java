import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter 2 double value");
    
    if(sc.hasNextDouble())
    { 
    	 double d1=sc.nextDouble();
     double d2=sc.nextDouble();
    	 double average=(d1+d2)/2;
    	 System.out.println("Average :"+average);
    }
    else 
    {
    	 System.out.println("Numbers are not Double");
    }
    	}

}
