package clg.dkte;

public class StringReverse {

	public static void main1(String[] args) {
		String original="Ankita";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		System.out.println(reverse);

	}
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Ankita");
		str.reverse();
		System.out.println(str);
	}

}
