package day3_variables_dataTypes;

public class primitive_variables {
   public static void main(String[] args) {
	
	   byte b1 = 25;
	   byte b2 = -25;
	   byte b3 = 127;
	   
	   System.out.println("b1 = " + b1);
	   System.out.println("b2 = " + b2);
	   System.out.println("b3 = " + b3);
	   
	   System.out.println();
	   
	   short s1 = -32567;
	   short s2 = 4114;
	   short s3 = -500;
	   
	   System.out.println("s1 = " + s1);
	   System.out.println("s2 = " + s2);
	   System.out.println("s3 = " + s3);
	   
	   System.out.println();
	   
	   int i1 = -2272727;
	   int i2 = 98907;
	   //to read easily use underscore on numbers:
	   int i3 = 100_000;
	   
       System.out.println("i1 = " + i1);
       System.out.println("i2 = " + i2);
       System.out.println("i3 = " + i3);
       
       System.out.println();
       
       //to specify the number as a long put L or l at the end of the number:        
      
       long l1 = 5000; //suffix L is optional. Literal 5000 is of int type.
       long l2 = -2147483649L; //suffix L is mandatory. This number is out of int rage.
       long creditCardNumber = 5876_3434_7656_7676L;
        
       
       System.out.println("l1 = " + l1);
       System.out.println("l2 = " + l2);
       System.out.println("creditCardNumber = " + creditCardNumber);
       
       System.out.println();
       
       //suffix F or f is mandatory to declare it's a float:
       float f1 = 2.1f;
       float f2 = 4.66F;
       float f3 = -9.873F;
       
       //double has enough space for decimal number so no need to add d or D suffix.
       double d1 = 3434333.133334434343434344;
       
       System.out.println("f1 = " + f1);
       System.out.println("f2 = " + f2);
       System.out.println("f3 = " + f3);
       System.out.println();
       System.out.println("d1 = " + d1 );


       System.out.println();

       
       char c1 = 'A';
       char c2 = 65; //Decimal value corresponding to character A
       
       
       System.out.println(c2);
       
       char c3 = '\u0041'; // unicode; css value of A
       
       System.out.println();
       System.out.println(c3);
       System.out.println();
       
       char c4 = '\u0066'; // css value of f
       
       System.out.println(c4);
       System.out.println();
       
       boolean status = true;
       boolean status2 = false;
       
       System.out.println("Eligibile to take the exam: " + status);
       System.out.println("Eligibile to take the exam: " + status2);
       System.out.println();
       
       String name = "Useyd";
       System.out.println("My name is " + name);
       
       
           
   
   
   
   
   }
}
