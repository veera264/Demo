package Task5;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int num=sc.nextInt();
		
		while(num!=0) {
			int num1=num%10;
			System.out.print(num1);
			num=num/10;
		}
	}

}
