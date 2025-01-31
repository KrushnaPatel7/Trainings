package p5;

class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("I :"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run() {
		for(int j=0;j<10;j++) {
			try {
				System.out.println("       J :"+j);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class C extends Thread{
	public void run() {
		for(int k=0;k<10;k++) {
			try {
				System.out.println("           K :"+k);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Demo1 {
 public static void main(String args[]) {
	 A a=new A();
	 B b=new B();
	 C c=new C();
	 a.start();
	 b.start();
	 c.start();
 }
}
