public class Variables_datatypes_literals {

	public static void main(String[] args) {
		
	// Variables:
		
		int number=123;   // correct way of creating variables
		int $number1=123; 
		int _number2=123;
		int number123=123;
		int number$=123;
		int my_Number=798933;
		
		
		int 2number=123;  // showing compile time error. 
		int number1@=123;
		
		//we cannot use keywords as variable names.
		
		int if=123;
		int for=123;
		int super=123;
				
/**************************************************************************************************************************************/
				
	// data types
		
		byte b=127;  // in byte we can store in range of -128 to -127
		short s=1234; // in short we can store in range of -32,768 to 32,767
		int num=123456; // in int we can store in range of -2,147,483,648 to 2,147,483,647
		long l=123456789; // in long we can store in range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float f=12.3f;   // in float we can store only decimal values
		double d=12.44; // in float we can store decimal values
		boolean b1=true; // in boolean we can store only true or false
		char c='a';     // in char we can store only single letter
		// if we want to store wrong data in different data type
		
		int num=1.2;  // it will show compile time error 'cannot convect double to int'
		
		int n=9223456789;  // if we store number that is greater than its range it will show compile time error "out of range error"
		
		char c1='ad'; // it will show compiletime error "invalid character constant"
		
/**************************************************************************************************************************************/				
		//literals
		
		// in java we have int,float,char,string,boolean
		
		byte b2=12; // integer literal
		short s2=123; // integer literal
		int i2=123;  // integer literal
		long l=8213713876e12786; // long literal
		float f2=1.2f;  // float literal
		char c2='a';  // character literal
		String s="veera";  // String literal
		boolean b2=true;  // boolean literal
		
	}

}
