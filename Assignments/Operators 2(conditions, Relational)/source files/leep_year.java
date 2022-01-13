package Task3;

import java.util.Scanner;

public class leep_year {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to check leep year or not:");
		int year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {System.out.println(year+" is a leep year");}
		else {System.out.println(year+" is not a leep year");}

	}

}
