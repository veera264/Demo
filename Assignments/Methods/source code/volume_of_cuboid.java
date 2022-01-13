package Task6;

import java.util.Scanner;

public class volume_of_cuboid {
	
	static void check_volume_of_cuboid(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of l , b, h");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		
		double volume=l*b*h;
		System.out.println("Volume of cuboid is :"+volume);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_volume_of_cuboid();
	}

}
