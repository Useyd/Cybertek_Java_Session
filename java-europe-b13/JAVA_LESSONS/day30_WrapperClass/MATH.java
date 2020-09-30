package day30_WrapperClass;

public class MATH {

	public static void main(String[] args) {
		
		
		//There were so many math methods. Some of them can be like:
		
		//Power
		double result = Math.pow(4.0, 2.0); // 4 power 2 is 16

		//Math is in lang package so we don't need to import it
		
		System.out.println(result);
	
	    //Square root (sqrt)
		double res2 = Math.sqrt(25.0);
		System.out.println(res2);
	
		//PI
		final double PI = Math.PI; //it will give the pi numbers in a dynamic way 
	    System.out.println(PI);
		
		//Round
		System.out.println(Math.round(4.3));//it is rounding the float number down. 4.3 will be 4 
		System.out.println(Math.round(4.6));//it will round up -> 5 
		
		//Floor
		System.out.println(Math.floor(4.9));//it will push to round the number down even if it's value higher then 4.5. Normally it should be 5 
	
		//Ceil
		System.out.println(Math.ceil(4.2));///it will push to round the number up even if it's value lower then 4.5. Normally it should be 4 
	
	
		
		
	}

}
