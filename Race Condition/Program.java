package Demo5.dkte;

public class Program {
	/*
	//race condition -- when deposit() and withdraw() methods are not declared synchronized
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Account acc=new Account(1,"saving ",10000);
		
		class DepositeThread extends Thread{
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					acc.deposite(100);
					System.out.println("Balance after Deposite:"+acc.getBalance());
				}
			}
		}
		DepositeThread dp=new DepositeThread();
		dp.start();
		
		class WithdrawThread extends Thread{
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					acc.withdraw(100);
					System.out.println("Balance after withdraw:"+acc.getBalance());
				}
			}
		}
		WithdrawThread wt=new WithdrawThread();
		wt.start();
		
		try {
			dp.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Balance:"+acc.getBalance());

	}*/
	/*
	//avoid race condition -- when deposit() and withdraw() methods are not declared synchronized
	// using "synchronized" block
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Account acc=new Account(1,"saving ",10000);
		
		class DepositeThread extends Thread{
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					synchronized (acc) {//LOCK
						acc.deposite(100);
						System.out.println("Balance after Deposite:" + acc.getBalance());
					}//UNLOCK
				}
			}
		}
		DepositeThread dp=new DepositeThread();
		dp.start();
		
		class WithdrawThread extends Thread{
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					synchronized (acc) {//LOCK
						acc.withdraw(100);
						System.out.println("Balance after withdraw:" + acc.getBalance());
					}//UNLOCK
				}
			}
		}
		WithdrawThread wt=new WithdrawThread();
		wt.start();
		
		try {
			dp.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Balance:"+acc.getBalance());

	}*/

	public static void main(String[] args) {
		Account acc=new Account(1,"saving ",10000);
		
		class DepositeThread extends Thread{
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					acc.deposite(100);
					System.out.println("Balance after Deposite:"+acc.getBalance());
				}
			}
		}
		DepositeThread dp=new DepositeThread();
		dp.start();
		
		class WithdrawThread extends Thread{
			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					acc.withdraw(100);
					System.out.println("Balance after withdraw:"+acc.getBalance());
				}
			}
		}
		WithdrawThread wt=new WithdrawThread();
		wt.start();
		
		try {
			dp.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Balance:"+acc.getBalance());
}
}
