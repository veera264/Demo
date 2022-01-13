package Task6;

import java.util.Scanner;

public class armstrong_number {
	
	static void armstrong() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int temp3=num;
		int count=0;
		while(num!=0) {
			int last=num%10;
			count++;
			num=num/10;
		}
		double d=0;
		
		while(temp!=0) {
			int temp1=temp%10;
			d+=Math.pow(temp1, count);
			temp=temp/10;
		}
		
		if(temp3==d) {System.out.println("Amstrong number");}
		else {System.out.println("Not a amstrong number");}
	}
	public static void main(String[] args) {
		
		armstrong();
	}

}
