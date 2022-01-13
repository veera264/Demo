package Task6;

import java.util.Scanner;

public class Radix {
	
	static void radix() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter u r format:");
		String format=sc.nextLine();
		if(format.matches("[0-1]+")) {
			System.out.println("you Entered Binary values with Base 2");
		}
		else {
			if(format.matches("[0-7]+")) {
				System.out.println("you Entered Octal values with Base 8");
			}
			else {
				if(format.matches("[0-9]+")) {
					System.out.println("you Entered Decimal values with Base 10");
				}
				else if(format.matches("[0-9A-F]+")) {
					System.out.println("you Entered Hexadecimal value with Base 16");
				}
				else {System.out.println("wrong format please enter correct fromat");}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radix();
	}

}
