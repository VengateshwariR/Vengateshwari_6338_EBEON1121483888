package Threads;

class Resource
{
	synchronized void share()
	{
		for(int i=0;i<5;i++)
		{
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread1 extends Thread
{
	Resource r;
	Thread1(Resource r)
	{
		this.r=r;
    }
	public void run() {
		r.share();
	}

}
class Thread2 extends Thread
{
	Resource r;
	Thread2(Resource r)
	{
		this.r=r;
    }
	public void run() {
		r.share();
	}

}

public class SynchronizationDemo
{
	public static void main(String[] args) {
		Resource r=new Resource();
		Thread t1= new Thread1(r);
		Thread t2= new Thread2(r);
		t1.start();
		t2.start();
		

		
	}

}
