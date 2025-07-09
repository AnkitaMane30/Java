import java.util.*;
public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int a=sc.nextInt();
    
    Integer i=new Integer(a);
    
    String binary=i.toBinaryString(a);
    System.out.println("Binary Value:"+binary);
    
    String octal=i.toOctalString(a);
    System.out.println("Octal value:"+octal);
    
    String hexa=i.toHexString(a);
    System.out.println("Hexadecimal Value:"+hexa);
	}

}
