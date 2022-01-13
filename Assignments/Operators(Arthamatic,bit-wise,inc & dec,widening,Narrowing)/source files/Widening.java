
public class Widening {

	public static void main(String[] args) {
		
		// type casting is converting one data type into a another data type
		/*
		  widening(upcasting) is storing a lower datatype value into a higher type type
		  it is also know as implicit conversion.
		 */

		
		short s=1234;
		int i=12345;
		long l=12345678;
		char c='a';
		float f=1.2f;
		double d=12.3;
		
/***************************************************************************************************************/		
		// byte
		// byte can compactable only for byte values
		
	
		/*
		  byte b=s; 
		  byte b=i; 
		  byte b=c;
		  byte b=l;      this shows a compile time error 
		 */
		byte b=123;
		byte b1=b;   // byte can store only byte values
		
/***************************************************************************************************************/		
		// short 
		// short can compactable only with byte,short
		
		/*
		  short s1=i; 
		  short s1=c; 
		  short s1=l;    we cannot store int,long,char,float,double,boolean
		  short s1=f; 
		  short s1=d;
		 */
		
		short s1=b;
		short s2=s1; // short can store only byte and short 
	
/***************************************************************************************************************/
		// int 
		// int can compactable only with byte,short,int,char
		
		/*
		  int i1=l; 
		  int i1=f;    // we can not store long,float,double,boolean
		  int i1=d;
		 */
		
		int i1=b;
		int i2=s;
   		int i3=c;    // we can store only byte,short,char,int
		int i4=i;
/***************************************************************************************************************/
		// long 
		// long can compactable with byte,short,int,char
		
		/*
		  long l1=f;
		  long l1=d;   // we cannot store float,double values and boolean in long
		 */
		
		long l1=b;
		long l2=s;
		long l3=i;   // we can store byte,int,short,char
		long l4=c;
/***************************************************************************************************************/
		// char 
		// in implicity we cannot store any thing in char except char
		
		/*
		  char c1=b; 
		  char c2=s; 
		  char c3=i;     // we cannot store byte,short,int,long,boolean
		  char c4=l; 
		  char c5=f; 
		  char c6=d;
		 */
		char c1=c;  // we can store char
		char c2=123; // we can assign direct int values to char
		
/***************************************************************************************************************/
		// float 
		// float can compactable with byte,short,int,long,char
		
	//  float f1=d;  we cannot store double values and boolean values
		
		float f1=b;
		float f2=s;
		float f3=i;    // we can store byte,short,int,long,char values
		float f4=l;
		float f5=c;
		

/***************************************************************************************************************/

		// double 
		// double can compactable with byte,short,int,long,char,float
		
		double d1=b;
		double d2=s;
		double d3=i;   // we can store byte,short,int,long,char,float values
		double d4=l;
		double d5=c;
		double d6=f;
	// we canot store boolean value in double
	
/***************************************************************************************************************/

		// boolean 
		// boolean can compactable only with boolean datatypes
		
/*		boolean b2=b;
		boolean b3=s;
		boolean b4=i;
		boolean b5=l;   boolean cannot store any datatype values 
		boolean b6=c;
		boolean b7=f;
		boolean b8=d;    */
		
	boolean bb=true;
	boolean bb1=bb;
	

	}

}
