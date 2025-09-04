package Demo7.dkte;

class Outer{
	static int outerField1 = 10; 
	int outerField2 = 20;
	static int field = 30;
	
	static class Inner{
		static int innerField1 = 40; 
		int innerField2 = 50;
		static int field = 60;
		
		public void display( ) {
			System.out.println("Outerfield1 : "+outerField1); //10
			//System.out.println("Outerfield1 : "+outerField2); //NOT OK
			System.out.println("Outerfield1 : "+Outer.field); //30
			
//			System.out.println("innerField1 : "+innerField1); //40
//			System.out.println("innerField1 : "+innerField2); //50
//			System.out.println("innerField1 : "+field); //60
		}
	}
}
public class Program {

	public static void main(String[] args) {
		Outer.Inner inobj=new Outer.Inner();
		inobj.display();

	}

}
