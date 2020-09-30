package day30_WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
/*		
		->Each of Java’s eight primitive data types has a class dedicated to it. These are known as
		  wrapper classes because they ”wrap” the primitive data type into an object of that
		  class.
		
		->The wrapper classes are part of the java.lang package, which is imported by default
		  into all Java programs.
		
		->Wrapper class in Java provides the mechanism to convert primitive into object and
		  object into primitive.	
*/
/*		

        Collections are not working with primitive data types. They are working with objects
        So Wrapper Classes are converting primitive to object an make them workable.
		
		Primitive Type          Wrapper Class
		boolean                       Boolean
		char                        Character
		byte                             Byte
		short                           Short
		int                           Integer
		long                             Long
		float                           Float
		double                         Double
*/
		
		int n1 = 10; // PRIMITIVE!
		
		Integer n2 = new Integer(10); // OBJECT!
		System.out.println(n1);
		System.out.println(n2);
		System.out.println();
		
		double d1 = 44.5;
		Double d2 = new Double(44.5);
		Double d3 = new Double("44.5");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);
		System.out.println();
		
		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println();
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)100); // we should do casting. Otherwise it will assume the value as integer.
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		
		
		
		
		
		
		//UPDATED SYNTAX OF WRITING WRAPPER CLASSES
		
		Integer num1 = Integer.valueOf(1234);
		System.out.println(num1);
		System.out.println();
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
	}

}
