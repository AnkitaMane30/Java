package Demo3.dkte;

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
		class Printable extends Thread
		{
			int num;
			public Printable(int num)
			{
				this.num=num;
			}
			@Override
			public void run() {
				for(int i=1;i<=10;i++)
				{
					System.out.printf("%d * %d = %d\n",num,i,num*i);
					//delay(1000);
				}
			}
		}
		Printable th1=new Printable(4);
		th1.setPriority(10);
		th1.start();
		
		Printable th2= new Printable(5);
		th2.setPriority(1);
		th2.start();
	}

}
