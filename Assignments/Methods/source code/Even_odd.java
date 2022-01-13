package Task6;

public class Even_odd {
	
	static void number(int i) {
		switch(i%2) {
		case 0:
			System.out.println("Even");
			break;
		default:
			System.out.println("Odd");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number(10);
	}

}
