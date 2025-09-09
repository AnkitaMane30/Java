package clg.dkte;
import java.util.*;
class Account{
	private int account_no;
	private int b_Balance;
	private int charges=0;
	private int credits;
	private int creditLimit;
	
	private int newbalance;
	public Account()
	{
//		this.account_no=0;
//		this.b_Balance=0;
//		this.charges=0;
//		this.credits=0;
//		this.creditLimit=0;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getB_Balance() {
		return b_Balance;
	}
	public void setB_Balance(int b_Balance) {
		this.b_Balance = b_Balance;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int calcNewBalance()
	{
		this.newbalance=b_Balance+charges-credits;
		return newbalance;
	}
	public boolean isExceed()
	{
		return calcNewBalance()>creditLimit;
	}
	
}
public class CreditLimitCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of aray");
		Account[] month=new Account[sc.nextInt()];
		for(int i=0;i<month.length;i++)
		{ 	month[i]=new Account();
			
			System.out.println("Enter Account No.:");
			int a=sc.nextInt();
			month[i].setAccount_no(a);
			System.out.println("Enter Beginning Balance:");
			month[i].setB_Balance(sc.nextInt());
			System.out.println("Enter total of all items charged by the customer this month");
			month[i].setCharges(sc.nextInt());
			System.out.println("Enter total of all credits applied to the customer’s account this month ");
			month[i].setCredits(sc.nextInt());
			System.out.println("Enter  credit card limit:");
			month[i].setCreditLimit(sc.nextInt());
			 
			if(i!=0 && i<month.length )
			{
				System.out.println("New Balance:"+month[i].calcNewBalance());
				if(month[i].isExceed())
				{
					System.out.println("Credit Limit Exceeded");
				}
			}
			
		}
	
		/*Account month=new Account();
		System.out.println("Enter Account No.:");
		int a=sc.nextInt();
		month.setAccount_no(a);
		System.out.println("Enter Beginning Balance:");
		month.setB_Balance(sc.nextInt());
		System.out.println("Enter total of all items charged by the customer this month");
		month.setCharges(sc.nextInt());
		System.out.println("Enter total of all credits applied to the customer’s account this month ");
		month.setCredits(sc.nextInt());
		System.out.println("Enter  credit card limit:");
		month.setCreditLimit(sc.nextInt());
		System.out.println("New Balance:"+month.calcNewBalance());
		if(month.isExceed())
		{
			System.out.println("Credit Limit Exceeded");
		}
		*/

		sc.close();
	}

}
