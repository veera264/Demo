
public class Bit_wise_operators {

	public static void main(String[] args) {
		
		// bit wise operators are used to perform the manipulation of individual bits of a numbers
		
		// & -->this is bit wise 'and'  it will return true if both are true otherwise it will return false
		// | --> this is a bitwise 'or' it will true if any one is true
		// ^ --> this is bitwise 'xor' it will return true if both are not equal
		// ~ --> this is compliment(not) it use 2's compiliment to return value
		// >> --> this is 'rightswift' it will swift bits to rightside based on the given value
		// << --> this is 'leftswift' it will swift bits leftside based on the given value
		
		int i=10;
		int j=8;
		// bitwise and 
		
		int and=i&j;
		System.out.println("bitwise and '&':"+and); // this will print 8 as output.
		
	    // bitwise or
		
		int or=i|j;
		System.out.println("bitwise or '|':"+or);  // this will print 10 as output.
		
		// bitwise xor
		
		int xor=i^j;
		System.out.println("bitwise xor '^':"+xor);   // this will print 2 as output.
		
		// compliment(not)
		
		int compliment=~i;
		System.out.println("compliment '~':"+compliment);  // this will print -11 as output.
		
 
	}

}
