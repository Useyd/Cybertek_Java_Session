package week2;

public class type_casting {

	public static void main(String[] args) {

		int i = 100;
		long l = i; //implicit casting - widening
		float f = l;//implicit casting - widening
		
		System.out.println("Int value: " + i);
	
		System.out.println("Long value: " + l);
	
		System.out.println("Float value: " + f);

		System.out.println("-------------------");
		
		double d = 100.04;
		//long l2 = d; ERROR
		long l2 = (long)d; // explicit casting - narrowing - data loss!
		int i2 = (int)l2;
		
		System.out.println(i2);
		System.out.println("-------------------");
		
		double d2 = 120.32;
		int i3 = (short)d2;
		
		System.out.println(i3);
		
	
	
	
	}

}
