package Threads;

class Res{
	public void run() {
	
	
		synchronized(this)
		{
			System.out.println("Starting of" +Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() +"....notified");
		}
	}
}
class N1 extends Thread{
	Res r;
	N1(Res r)
	{
		this.r=r;
	}
	public void run()
	{
		synchronized(r)
		{
			System.out.println("Starting of" +Thread.currentThread().getName());
			try {
				r.wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +"....notified");
		}
	}
}

class N2 extends Thread{
	Res r;
	N2(Res r)
	{
		this.r=r;
	}
	public void run()
	{
		synchronized(r)
		{
			System.out.println("Starting of" +Thread.currentThread().getName());
			r.notify();
			System.out.println(Thread.currentThread().getName() +"....notified");
		}
	}
}
public class WaitNotifyDemo
{
	public static void main(String[] args)
	{
		Res t1 = new Res();
		N1 t2 = new N1(t1);
		N2 t3 = new N2(t1);
		
		t2.start();
		t3.start();
		

		
	}

}
