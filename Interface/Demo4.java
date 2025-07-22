package clg.dkte;

interface A{
	void f1();
	void f3();
}
interface B{
	void f2();
	void f3();
}
class C implements A,B{
	public void f1()
	{
		System.out.println("c.f1()");
	}
	public void f2()
	{
		System.out.println("c.f2()");
	}
	public void f3()
	{
		System.out.println("c.f3()");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		A a=new C();
		a.f1();
		a.f3();
		
		B b=new C();
		b.f2();
		b.f3();

	}

}
