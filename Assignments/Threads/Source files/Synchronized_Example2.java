package Threads;

class user{
	
	synchronized void exc(String name,String num) {
		 System.out.print(name);
		 System.out.println(" is credeted amount "+num);
	 }
}
class user1 extends Thread{
	user u;
	user1(user u){
		this.u=u;
	}
	public void run() {
		u.exc("veera","1234");
	}
}
class user2 extends Thread{
	user u;
	user2(user u){
		this.u=u;
	}
	public void run() {
		u.exc("mani","4321");
	}
}
public class Synchronized {

	public static void main(String[] args)throws Exception {
		
		user u=new user();
		user1 u1=new user1(u);
		user2 u2=new user2(u);
		u1.start();
		u2.start();
		
	}

}
