
public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		/*
		  by using arthamatic operators in java we can do math operations like
		  addition, substraction, multiplication, division,modulo.
		 */
		 
		//  Addition '+'
		//  Subtraction  '-'
		//  Multiplication '*'
		//  Division '/'
		//  Modulo '%'
		
		int i=10;
		int j=20;
		
		int addtition=i+j; // adding the two values 
		System.out.println("Addition of two values:"+addtition);
		
		int substraction=i-j; // substracting two values
		System.out.println("Subtracting the two values:"+substraction);
		
		int multiplication=i*j; // Multiplying the two values
		System.out.println("Multiplication of two values:"+multiplication);
		
		int division=i/j; // division will give the quotient when we divide by value
		System.out.println("Division of two values:"+division);
		
		int modulo=i%j;   // modulo will give the remender when we divided by value
		System.out.println("modulo of two values:"+modulo);
		
		
		
		// Operator precedence determines the order in which the operators in an expression are evaluated
		
		// * / % this three are a higher precedence in java 
		// + - this are a lower precedence in java  
		
		int pre = 12 - 4 * 2; // as per precedence first 4*2 will exgecute =8 then 8 substract with 12.
		System.out.println("precedence value before:"+pre);
		
		pre = (12 - 4) * 2; /*
							  here we use () that is grouping values that is we are telling compiler to
							  first excegute values in brackets then multiple with next value.
							 */
		System.out.println("precedence value After:"+pre);
		
		// Result of data types
		
		// byte+int=int -->this will give  int value
		// short+int =int  -->this will give  int value
		// int +long = long --> this will give long value
		// long+float=float --> this will give the float value
		// float+double=double --> this will give double value
		// char+ int =int --> this will give int value
		// double+int
		
		byte b=1;
		short s=12;
		int i1=1234;
		long l=123456789;
		float f=123.3f;
		double d=123.45;
		
		
		System.out.println("Adding byte and short:"+b+s); // here we are adding byte and short so it will give int value
		System.out.println("Adding short and int:"+s+i1); // here we are adding short and int so it will give int value
		System.out.println("Adding int and long:"+i1+l); // here we are adding int and long so it will give long value
		System.out.println("Adding long and float:"+i1+f); // here we are adding long and float so it will give float value
		System.out.println("Adding float and double:"+f+d); // here we are adding float and double so it will give double value
		System.out.println("Adding char and int:"+('a'+10)); // here we are adding char and int so it will give int value
		/*
		  when we are adding char with int char is converted into a int values based on
		  the Ascii A-Z =65-90 a-z=97-122
		 */
		// as per ascii the valueof  'a' is a 97 when we add with 10 it will give 107  
	}

}
