package day18_readingUserInput;

import java.util.Scanner;//importing scanner class from java.util package
import java.util.*;//it will import all the classes in java.util package. * calls all of them..
public class UserInput {

	public static void main(String[] args) {

     
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a byte value: ");
    byte b1 = sc.nextByte();
    
    System.out.println(b1);
    System.out.println(b1*4);
	System.out.println(b1%3);
	System.out.println();
	
	
	System.out.print("Enter another byte value: ");
	byte b2 = sc.nextByte();
	
	System.out.println(b2);
	System.out.println();
	
	System.out.print("Enter a short value: ");
	short s1 =  sc.nextShort();
	
	System.out.println("Short value is: " + s1);
	System.out.println();
	
	System.out.print("Enter an integer value: ");
	int i1 = sc.nextInt();
	
	System.out.println("Integer value is: " + i1);
	System.out.println();
	
	System.out.print("Enter a long value: ");
	long l1 = sc.nextLong();
	
	System.out.println("Long value is: " + l1);
	System.out.println();
	
	System.out.print("Enter a double value: ");
    double d1 = sc.nextDouble();
	
	System.out.println("Double value is: " + d1);
	System.out.println();
	
	System.out.print("Enter a boolean value: ");
	boolean B1 = sc.nextBoolean();
	
	System.out.println("Boolean value is: " + B1);
	}

}
