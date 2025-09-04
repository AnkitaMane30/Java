package Demo8.dkte;

class Outer{
	static int outerField1 = 10; 
	int outerField2 = 20;
	static int field = 30;
	
	class Inner{
		final static int innerField1 = 40; 
		int innerField2 = 50;
		final static int field = 60;
		
		public void display( ) {
			System.out.println("Outerfield1 : "+outerField1); //10
			System.out.println("Outerfield1 : "+outerField2); //
			System.out.println("Outerfield1 : "+Outer.field); //30
			
		    System.out.println("innerField1 : "+innerField1); //40
			System.out.println("innerField1 : "+innerField2); //50
			System.out.println("innerField1 : "+field); //60
		}
	}
}
public class Program2 {

	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner inobj=out.new Inner();
		inobj.display();
	}

}
