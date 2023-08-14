package core;
//Thread -> is smallest unit of process
//to execute thread two ways
	//1.Thread class
	//2.Runnable interface
//runnable interface better way to achieve thread
//Thread priority 
	//1.Min->1
	//2.NORM->5
	//3.MAX->10
class ChildThread implements Runnable{
	String msg;
	Thread t;
	public ChildThread(String msg) {
		this.msg=msg;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(this.t+" : "+i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
class NewThread extends Thread{
	String msg;
	Thread t;
	public NewThread(String msg) {
		this.msg=msg;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(this.t+" : "+i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class P25_Thread {
	public static void main(String[] args) {
		NewThread t1 = new NewThread("hello");
		System.out.println("hello");
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+" : "+i);
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main thread complete");
	}
}
