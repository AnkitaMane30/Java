package Demo1.dkte;

public class Program {
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		class Mythread extends Thread
		{
			@Override
			public void run() {
				for(int i=0;i<=7;i++)
				{
					System.out.println("my"+i);
					delay(1000);
				}
			}
		}
		Mythread th1=new Mythread();
		th1.setDaemon(false);
		th1.start();
		
		class YourThread implements Runnable
		{

			@Override
			public void run() {
				
				for(int i=0;i<=10;i++)
				{
					System.out.println("your"+i);
					delay(1000);
				}
			}
			
		}
		Thread th2=new Thread(new YourThread());
		th2.setDaemon(true);
		th2.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("main"+i);
			delay(1000);
		}

	}

}
