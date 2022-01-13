
public class Narrowing {

	public static void main(String[] args) {
		
		// narrowing(downcasting) passing a high  datatype into a low type datatype
		
		short s=1234;
		int i=12345;
		long l=12345678;
		char c='a';
		float f=1.2f;
		double d=12.3;

/***************************************************************************************************************/		
	   // byte
		byte b=s;    // this will show a error because we cannot store short value in byte.
		
		Ex:
/*		b=i;
		b=l;		we cannot do like this 
		b=c;
		b=f;
		b=d;   */
		
		b=(byte)s;   // this will work because we r  downcasting the short to byte.
		b=(byte)i;
		b=(byte)l;
		b=(byte)c;
		b=(byte)f;
		b=(byte)d;
	
/***************************************************************************************************************/		
		// short
		
	// in short we can store byte values but we not store int,long,char,float,double, if u want to store for that we have to use downcasting.
		
		short s1=i;    // this will show a error because we cannot store int value in short.
		
			Ex:	
				
		/*		s1=l;		we cannot do like this but we can do 
				s1=c;
				s1=f;
				s1=d;   */
				
				   
				s1=(short)i;
				s1=(short)l;   // this will work because we r  downcasting.
				s1=(short)c;
				s1=(short)f;
				s1=(short)d;
		
		
/***************************************************************************************************************/		
	
		// int 
		
		// in int we can store byte,short,char values but we cannot store long,float,double. if u want to store for that we have to use downcasting.
		
				int i1=l;    // this will show a error because we cannot store long value in int.
				
				Ex:	
					
			/*				we cannot do like this but we can do 
					
					i1=f;
					i1=d;   
					         */
					   
					 
					i1=(int)l;
					i1=(int)f;    // this will work because we r  downcasting.
					i1=(int)d;
		

		
/***************************************************************************************************************/				
		// long
					
		// in long we can store byte,short,int,char but we cannot store float,double.we can store by using downcasting.
		
		long l1=f; // this will show error because we cannot sotre float value in long.
		
//		Ex:
		// l1=d;  
		
	l1=(long)f;
	l1=(long)d;   //this will work because we r downcasting.
		
/***************************************************************************************************************/				
		// float 
	
	// in float we can store byte,short,long,char,int but we cannot store double values ,if we can store by using downcasting.
	
	float f1=d;  // this will show error because  we cannot store double value in float
	
	f1=(float)d;  // this work because we r downcasting.

/***************************************************************************************************************/		
		
	// double
	// in double we can store byte,short,int,long,float,char.
	
		
	double d1=b;
	double d2=s;
	double d3=i;   // we can store byte,short,int,long,char,float values
	double d4=l;
	double d5=c;
	double d6=f;	
		
/***************************************************************************************************************/		
	
	//  in boolean we cannot store any other premitive datatype values
	
	// it will store only boolean values like true,false.

/***************************************************************************************************************/		
	// char
	// in char we cannot store any values.
	
	char c1=(char)i;
	c1=(char)b;
	c1=(char)s;
	c1=(char)l;        
	c1=(char)f;
	c1=(char)d;
	
	
	
	
	
	
	
	
	}

}
