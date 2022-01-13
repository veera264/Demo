package Task5;

import java.util.Scanner;

class A{
	public static int reverse(int num1) {
		int num2=0;
		while(num1!=0) {
			num2=num2*10+num1%10;
			num1=num1/10;
		}
		return num2;
	}
}
public class Number_palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check palindrom or not:");
		int num=sc.nextInt();
		int num3=A.reverse(num);
		if(num==num3) System.out.println(num+" is a palindrom");
		else System.out.println(num+" is not a palindrom");
		sc.close();

	}

}
