package Task6;

import java.util.Scanner;

public class Reverse_number {
	
	static void reverse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int num=sc.nextInt();
		
		while(num!=0) {
			int num1=num%10;
			System.out.print(num1);
			num=num/10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
	}

}
