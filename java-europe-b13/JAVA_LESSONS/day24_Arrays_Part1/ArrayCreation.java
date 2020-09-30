package day24_Arrays_Part1;

public class ArrayCreation {

	//Since arrays are objects they are created in HEAP memory
	
	public static void main(String[] args) { 
	
		//Option-1 for creating an array:
		int[] numbers;
		numbers = new int[3]; // it will create a three valued array
		
		//Option-2:
	    int[] numbres = new int[5]; // we can write it in the same line.
		
	    float[] temp = new float[110];
		
	    char[] letters = new char[40];
	    
	    long[] units = new long[50];
	    
	    String words[] = new String[5];//we can put our square brackets either after or before the data type.4
	    
	    //ONCE ARRAY IS CREATED, IT'S SIZE CANNOT BE CHANGED ANYMORE!!!!!
        final int NUM_ELEMENTS = 6;
        int[] numberes = new int[NUM_ELEMENTS];

	
        System.out.println(numbers[2]); // it will print the default value of int : 0. Because we didn't assign any value yet.
	                                    // when we assigned, it will show the second index of that value
	
        System.out.println(temp[84]);  // it will print the default value of float : 0.0 - Because we didn't assign any value yet.
                                       // when we assigned, it will show the 84. index of that value
	
        System.out.println(words[4]); //  it will print the default value of String : null. Because we didn't assign any value yet.
                                      // when we assigned, it will show the fourth index of that value
	
      //System.out.println(units[50]); -> when we write this it will give error.
      //                               -> it can be maximum 49. Because index starts from 0.
      //                               -> length is 50. But index can't be 50. Last index must be length-1. 
	
        System.out.println(units[49]); // so it will work. But print just the default value: 0.
	
	}

}
