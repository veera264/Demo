package Task6;
import java.util.Scanner;

public class Qudratic_Expression {
	
	static void quadratic_expression(){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur input values a,b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double determinant=b*b-4*a*c;
		double root1 = 0,root2 = 0;
		//checking if determinant is greater than 0.
		if(determinant>0)
		{
			root1=(-b+Math.sqrt(determinant))/(2*a);
			root2=(-b+Math.sqrt(determinant))/(2*a);
		System.out.format("root1 =%.2f and  root2=%.2f", root1,root2);
		}
		//checking if determinant is equal to 0
		else if(determinant==0)
		{
		root1=root2=-b/(2*a);
		System.out.format("root1=root2=%.2f",root1);
		}
		else
			//if determinant is less than 0.
		{
			//roots are complex number and distinct.
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-determinant)/(2*a);
			System.out.format("root1=%.2f+%.2fi", real,imaginary);
			System.out.format("\nroot2=%.2f-%.2fi",real,imaginary);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quadratic_expression();
	}

}
