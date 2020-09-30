package day30_WrapperClass;

public class Boxing {

	public static void main(String[] args) {
		
		//AUTOBOXING -> primitive to object

		Integer num1 = 1234;//object
		int n = 5;          //primitive
		Integer num2 = n;   //primitive to object
		
		//UNBOXING -> object to primitive
		
		Double d1 = new Double(34.2);//object
		double d2 = d1;              //primitive
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		System.out.println();
		
		long l1 = new Long(6000000L); //Unboxing object to primitive Long to long...
 
		Long l2 = new Long(32655454); //No Boxing here
		long l3 = l2;//object to primitive. Unboxing
	
		Integer num12 = 4;
		Integer num123 = num12;
		System.out.println(num12);
		System.out.println(num123);
	
		int x = 345;
		double y = x; //casting is possible with primitive data
		
		//Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; -> casting is not possible with wrapper classes
	}

}
