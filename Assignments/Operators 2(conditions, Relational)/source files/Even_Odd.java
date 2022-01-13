package Task3;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter u r number:");
		int i=sc.nextInt();
	
		switch(i%2) {
		case 0:
			System.out.println("Even");
			break;
		default:
			System.out.println("Odd");
			break;
		}

	}

}
