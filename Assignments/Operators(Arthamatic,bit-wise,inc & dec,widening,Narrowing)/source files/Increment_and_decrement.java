
public class Increment_and_decrement {

	public static void main(String[] args) {
		
		// Increment and decrement is a unary operators in java 
		// by using that increment and decrement we can increase value and we can decrease the value
		
		/*
		  increment in java as two types: 
		  1.pre increment. 
		  2.post increment.
		  
		  pre increment means first we can increment the value then its assign to
		  another variable 
		  int i=9; 
		  int j=++i; here first i value increment by one and
		 
		 it will assing to j so, i =10 and j=10
		 
		  post increment means first we can assign the value then its increment the
		  value
		  int i=9; 
		  int j=i++; here first i value assign then i value incremented
		  so, i =10 and j=9
		 */
		
		int i=10;
		int j=++i;  // this is a preincrement first its increment i than it assign to j
		System.out.println("i value in preincrement:"+i);
		System.out.println("j value in preincrement:"+j);
		
		int i1=9;
		int j1=i1++;  // this is a postincrement first its assign value to j1 then it increment i1 
		System.out.println("i1 value in postincrement:"+i1);
		System.out.println("j1 value in postincrement:"+j1);
		
		
		/*
		  decrement in java as two types: 
		  1.pre decrement. 
		  2.post decrement.
		  
		  pre decrement means first we can decrement the value then its assign to
		  another variable 
		  int i=9; 
		  int j=--i; here first i value decrement by one and  it will assing to j so, i =8 and j=8
		 
		  post decrement means first it will assign value then it will decrease the value
		  int i=9; 
		  int j=i--; here first i value assign then i value decrement
		  so, i =9 and j=8
		 */
		int i2=10;
		int j2=--i2;  // this is a predecrement first its decrement i2 than it assign to j2
		System.out.println("i2 value in predecrement:"+i2);
		System.out.println("j2 value in predecrement:"+j2);
		
		int i3=9;
		int j3=i3--;  // this is a postdecrement first its assign value to j3 then its decrement i3 
		System.out.println("i3 value in postdecrement:"+i3);
		System.out.println("j3 value in postdecrement:"+j3);
		
	}

}
