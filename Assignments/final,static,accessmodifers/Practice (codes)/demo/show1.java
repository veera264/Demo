package demo;


public class show1 {
	
	int num;
	public void show() {
		for(int i=1;i<=10;i++) {
			num=i*5;
			System.out.println("set "+num);}
	}
	public static void main(String[] args){
		show1 s=new show1();
		s.show();
	}
}