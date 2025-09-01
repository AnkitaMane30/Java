package Demo7.dkte;

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
		class myThread extends Thread
		{
			@Override
			public void run() {
				for(int i=1;i<=10;i++)
				{
					System.out.println("my "+i);
					delay(1000);
				}
				
			}
		}
		myThread th1=new myThread();
		th1.start();
		class YourThread implements Runnable{

			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
				System.out.println("your "+i);
				delay(1000);
				}
				
			}
			
		}
		Thread th2=new Thread(new YourThread());
		th2.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("main "+i);
			delay(1000);
			}
		

	}

}
