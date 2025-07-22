//Interface
package clg.dkte;
interface Printable{
	/*public static final*/int number=10;
	/* public abstract*/void display();
}
class Test implements Printable{
	public void display()
	{
		System.out.println("Number:"+Printable.number);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Test t=new Test();
		t.display();

	}

}
