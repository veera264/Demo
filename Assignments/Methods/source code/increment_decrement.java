package Task6;

public class increment_decrement {
	
	static void inc(int i) {
		int j=++i;
		System.out.println("increment of i is: "+j);
	}
	static void dec(int i) {
		System.out.println("decrement if i is: "+--i);
	}
	public static void main(String[] args) {
		inc(10);
		dec(10);
	}

}
