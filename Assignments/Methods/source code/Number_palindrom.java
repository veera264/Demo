package Task6;

public class Number_palindrom {
	static void palindrom(int num1) {
		int num3=num1;
		int num2=0;
		while(num1!=0) {
			num2=num2*10+num1%10;
			num1=num1/10;
		}
		if(num2==num3) System.out.println(num3+" is a palindrom");
		else System.out.println(num3+" is not a palindrom");
		
	}
	public static void main(String[] args) {
		palindrom(120);

	}

}
