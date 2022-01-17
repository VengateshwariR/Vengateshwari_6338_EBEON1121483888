package Threads;

class  A1 extends Thread{
	public void run() {
		System.out.println("Thread A Starts");
		for(int i=0;i<5;i++) {
		System.out.println("Thread A"+i);
		}
	}
}
class B1 extends Thread{
	public void run() {
		System.out.println("Thread B Starts");
		for(int i=0;i<5;i++) {
		System.out.println("Thread B"+i);
		}
	}
}



public class demo {

	public static void main(String[] args) throws InterruptedException {
		A1 t1=new A1();
		B1 t2=new B1();
		
		t1.start();
		t1.suspend();
		t2.start();
		
	}

}
