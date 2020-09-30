package day30_WrapperClass;

public class varArgs {// VAR ARGS MEANS VARIABLE ARGUMENTS!

	public static void main(String[] args) {
		
		sum(2,4);
        sum(2,3,4,5);
        sum(4,23,67,88,99,67);
	
	
       System.out.println( concat("Apple", "Orange", "Result", "123"));
	
	}

	public static void sum(int... numbers) {//... creates a new array with the given values. It converts array with each new given values
		                                    // a varArg parameter can take a variable number of arguments. 
		int sum=0;
	
		for(int value: numbers) {
			
			sum+=value;
		}
	    System.out.println(sum);
	
	}
	
	public static String concat(String... strs) {
		
		String newStr="";
		
		for(String str: strs){		
		
			newStr = newStr + str.charAt(2);//it will took the second indexes of all elements, concat them and create a new String...
		}
	
		return newStr;
	}
}
