package Task5;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find fibonacci series:");
		int input=sc.nextInt();
		int num=0;
		int num1=1;
		System.out.println(num);
		System.out.println(num1);
		
		for(int i=0;i<=input;i++) {
			int num2=num+num1;
			num=num1;
			num1=num2;
			System.out.println(num2);
		}
	}

}
