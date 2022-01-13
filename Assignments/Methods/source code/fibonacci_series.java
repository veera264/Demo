package Task6;

public class fibonacci_series {
	
	static void fib(int i) {
		int num=0;
		int num1=1;
		System.out.println(num);
		System.out.println(num1);
		
		for(int j=0;j<=i;j++) {
			int num2=num+num1;
			num=num1;
			num1=num2;
			System.out.println(num2);
		}
	}
	public static void main(String[] args) {
		fib(10);

	}

}
