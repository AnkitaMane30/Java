package clg.dkte;
class Fraction implements Comparable
{
	private int n,d;
	public Fraction()
	{
		
	}
	public Fraction(int n,int d)
	{
		this.n=n;
		this.d=d;
	}
	public double value()
	{
		double r=n/d;
		return r;
	}
	@Override
	public int compareTo(Object o)
	{	Fraction other=(Fraction)o;
		if(this.value()==other.value())
			return 0;
		else if(this.value()>other.value())
			return 1;
		else
			return -1;
	}
}
public class ComparableInterface {

	public static void main(String[] args) {
		Fraction f1= new Fraction(10,2);
		Fraction f2=new Fraction(20,2);
		int r=f1.compareTo(f2);
		System.out.println("Res:"+r);
	}

}
