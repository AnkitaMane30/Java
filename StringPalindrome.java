package clg.dkte;

public class StringPalindrome {

	public static void main(String[] args) {
		String original="PHP";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("string is Palindrome");
		}
		else
		{
			System.out.println("string is not Palindrome");
		}
	}

}
