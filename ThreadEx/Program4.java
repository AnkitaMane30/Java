package Demo4.dkte;

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

		class PrintTable extends Thread{
			private int num; 
			
			public PrintTable(int num) {
				this.num = num;
			}
			@Override
			public void run() {
				for(int i = 1 ; i<=10 ; i++) {
					System.out.printf("%d * %d = %d\n",num,i,num*i);
					delay(400); 
				}
			}
		}
		PrintTable th=new PrintTable(4);
		System.out.println("State:"+th.getState());
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("state: "+th.getState());

	}

}
