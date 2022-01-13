import java.util.Scanner;

public class Volume_of_Cuboid {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of l , b, h");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		
		double volume=l*b*h;
		System.out.println("Volume of cuboid is :"+volume);
	}

}
