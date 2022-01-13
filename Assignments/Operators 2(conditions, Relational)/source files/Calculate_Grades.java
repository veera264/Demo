package Task3;

import java.util.Scanner;

public class Calculate_Grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter u r Marks:");
		int d=sc.nextInt();
		d=d/10;
		switch(d) {
		case 1:case 2:case 0: System.out.println("u r grade is 'F' grade point '0'"); break;
		case 3: System.out.println("u r grade is 'D' grade point '4.0'"); break;
		case 4: System.out.println("u r grade is 'C2' grade point '5.0'");
		case 5: System.out.println("u r grade is 'C1' grade point '6.0'"); break;
		case 6: System.out.println("u r grade is 'B2' grade point '7.0'"); break;
		case 7: System.out.println("u r grade is 'B1' grade point '8.0'"); break;
		case 8: System.out.println("u r grade is 'A2' grade point '9.0'"); break;
		case 10:case 9: System.out.println("u r grade is 'A1' grade point '10.0'"); break;
		default: System.out.println("Please enter marks from 0 to 100");
		}
		
	}

}
