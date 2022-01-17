package Threads;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A is started");
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread A is Running" +i);
		}
		System.out.println("Thread A is existed" );
		
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B is started");
		for (int i=0;i<5;i++)
		{
			System.out.println("Thread B is Running" +i);
		}
		System.out.println("Thread B is existed" );
		
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.println("Thread C is started");
		for (int i=0;i<5;i++)
		{
			System.out.println("Thread C is Running" +i);
		}
		System.out.println("Thread C is existed" );
		
	}
}


public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		A ThreadA = new A();
		B ThreadB = new B();
		C ThreadC = new C();
		//Thread a1 =new Thread(ThreadA);
		//Thread b1 =new Thread(ThreadB);
		//Thread c1 =new Thread(ThreadC);
		ThreadA.start();
	    ThreadB.start();
		ThreadC.start();
		
		System.out.println("Exit from the main");
		
	}
}