package secondclass;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		
		//ur project
		int i; //decelaration.
		short empid;
		
		
		//external project
		
		short s = 50;
		int id = 4575;
		//store external project variables to ur project
		
		i=s;
		System.out.println("the value of s is " + s);
		System.out.println("The value of i is " + i);
		
		//empid = id;   // in this line id is of int and int size is more thank short.
		
		//Always remember that if right hand side of the data type is larger than left hand side then you will have to type cast it & 
		//if it is smaller then no need to type cast or
		//we can say that we need confirmation.
		
		
		empid = (short)id;
		
		
		byte b1 =1;
		int i2 = 345;
		b1 = (byte) i2;
		
		i2 = b1;
		
		float f1;
		double d1 = 34.54;
		
		f1 = (float)d1;   // error because right hand side is in more size than left hand side and then in that case wew need to do type cast.
		
		d1=f1;
		
		int i3= (int) f1;
		i3 = (int) d1;
		
		long l1 = 3456;
		short s2 = 13;
		
		l1=s2;
		s2=(short)l1;
		
		System.out.println(l1);
		
		//char to int
		// It stores the ascii value of the charcter 
		
		char c = 'B';
		int i4 = c;
		
		System.out.println("The value of c is " + c);
		System.out.println("The value of i4 is " + i4);  // ASSCII value 
		
		//int to char
		int i5 = 9756;
		char c1 = (char)i5;
		System.out.println("The value of i5 is " + i5);
		System.out.println("The value of c1 is " + c1);
		
		//char to double
		
		double d3 = 768.53;
		char c2 = (char)d3;
		
		System.out.println("The value of d3 is " + d3);
		System.out.println("The value of c2 is " + c2);
		
		//whenever you do the type cast you might loose the data, there are high chances that you will lose the data,
		//see the loss
		double d = 556.7447;
		int i6 = (int)d;
		System.out.println("the value of d is " + d);
		System.out.println("the value of i6 is " + i6); // so here loss is decimals is lossing.
		
		//integer to string
		// Every primitive data type has corresponding wrapper class
		
		int i8 = 56;
		System.out.println("The Integer i8 is " + i8+10); //66
		String s1= Integer.toString(i8);
		System.out.println("The converted string is " + s1+10); //5610
		System.out.println("The converted string is " + s1+10+1); //56101
		System.out.println("The converted string is " + 10+s1+10+1);//1056101
		System.out.println("The converted string is " + s1+10+"Bipin");//56+10+bipin
		System.out.println("The converted string is " + 50+10+s1+10+1);//501056101
		
		/*Execution in java starts from left to right */


		
		//String to integer
		
		String s3 = "120";
		System.out.println( s3+10); //12010
		
	int i9=	Integer.parseInt(s3);
	System.out.println( i9+10); //130
	
	
	
//	String s4 = "Bipin";
//	int i10= Integer.parseInt(s4);
//	System.out.println(i10);
	
	//byte to short
	
	byte b3=127;
	short S1=(short)b3;
	short S = Byte.valueOf(b3);
	
	System.out.println(S1);
	
	//byte to long
	
	
	//double to string
	
	double d2 = 35.54;
	System.out.println(d2+10);
	String S2 = Double.toString(d2);
	
	System.out.println(S2+10);
	
	//String to double
	
	String S3= "52.23";
	System.out.println(S3+10);
	
	double d4= Double.parseDouble(S3);
	System.out.println(d4+10);
	
		
		
		
		
		
		

		
		
		
		

	}

}
