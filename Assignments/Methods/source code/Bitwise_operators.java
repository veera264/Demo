package Task6;

public class Bitwise_operators {
	
	static void and(int i,int j) {
		int k=i&j;
		System.out.println("and operation of i and j is: "+k);
	}
	static void or(int i,int j) {
		int k=i|j;
		System.out.println("or operation of i and j is: "+k);
	}
	static void xor(int i,int j) {
		int k=i^j;
		System.out.println("xor operation of i and j is: "+k);
	}
	static void compliment(int i) {
		int k=~i;
		System.out.println("compliment operation of i and j is: "+k);
	}
	public static void main(String[] args) {
		and(2,3);
		or(2,3);
		xor(2,3);
		compliment(10);

	}

}
