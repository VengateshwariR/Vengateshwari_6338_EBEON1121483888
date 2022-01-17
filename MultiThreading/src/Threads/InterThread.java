package Threads;

class CalculateAmount extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
	    {
			for(int i=1;i<=10;i++)
			{
				total=total+100;
			}
			this.notify();
	    }
	}
}

public class InterThread
{
	public static void main(String[] args)throws InterruptedException
	{
		CalculateAmount obj=new CalculateAmount();
		
		obj.start();
		synchronized(obj)
		{
			obj.wait();
		}
		System.out.println("Total amount is "+obj.total);
		
	}
	

}
