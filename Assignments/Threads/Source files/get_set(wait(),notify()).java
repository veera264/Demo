package Threads;

class c{
	
	boolean b=false;
	int num;
	public synchronized void set(int k) {
		while(b) {try{wait();}catch(Exception e) {}}
		num=k;
		System.out.println("set: "+num);
		b=true;
		notify();
		
	}
	public synchronized void get() {
		while(!b) { try{wait();}catch(Exception e) {}}
		System.out.println("get: "+num);
		b=false;
		notify();
	}
}
class p extends Thread{
	c c1;
	p(c c1){this.c1=c1;}
	public void run() {
		int i=0;
		while(i<=10) {
			c1.set(i++);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class p1 extends Thread{
	c c1;
	p1(c c1){this.c1=c1;}
	public void run() {
		int i=0;
		while(i<=10) {
			c1.get();
			i++;
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class get_set {

	public static void main(String[] args)throws Exception {
		 c c11=new c();
		 p p1=new p(c11);
		 p1 p2=new p1(c11);
		 p1.start();
		 p2.start();
	}

}
