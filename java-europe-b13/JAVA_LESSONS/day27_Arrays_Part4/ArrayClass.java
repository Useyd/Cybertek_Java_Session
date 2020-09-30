package day27_Arrays_Part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		//toString()
		int[] nums = {43, 12, 4, 1, 3, 5};
		System.out.println(Arrays.toString(nums));
	    System.out.println();
	    
		//equals()
		int[] nums1 = {4, 5, 6, 10, 100};
		int[] nums2 = {4, 5, 6, 10, 100};
	    System.out.println(Arrays.equals(nums1, nums2));
	    System.out.println();
	    
	    //sort() : sorts array in ascending order
	    int[] nums3 = {23, 153, 45, 11, 53, 5};
		Arrays.sort(nums3);
		System.out.println(Arrays.toString(nums3));
	    System.out.println();
	    
		//All starts capital letter
		String[] languages = {"Zulu","Spanish","Italian","English","Polish","Arabic"};
	    Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
	    System.out.println();
	    
		//if some starts with small letter
		String[] languages1 = {"Zulu","Spanish","Italian","English","Polish","arabic"};
	    Arrays.sort(languages1);
		System.out.println(Arrays.toString(languages1));
	    System.out.println();
	    
		//if some starts with number
		String[] languages2 = {"1Zulu","Spanish","2Italian","English","Polish","arabic"};
		Arrays.sort(languages2);
	    System.out.println(Arrays.toString(languages2));
	    System.out.println();
	    
	    //sort of all kinds
	  	String[] languages3 = {"1Zulu","@Spanish","2Italian","english","Polish","arabic"};
	  	Arrays.sort(languages3);
	    System.out.println(Arrays.toString(languages3));
	    System.out.println();
	
	    //binarySearch() -> gives index of the selected value
	    int[] numx = {4,6,7,1,55};
	    System.out.println(Arrays.binarySearch(numx, 55));//Looks for index of 55 in numx. Output will be 4.  
	    System.out.println(Arrays.binarySearch(numx, 5));//-2 -> -(insertionPoint)-1 -> 5 is between 4 and 6. between 4 and 6 index can be 1 so -(1)-1=-2
	    System.out.println(Arrays.binarySearch(numx, 15));//-5 -> -(4)-1
	    System.out.println();
	
	    //copyOf()
        double[] d1 = {2,3,4,5,12,4};
        double[] d2 = d1;//this is not copy action.
                         //this is reference matching.
                         //when we change one of them's elements other one's will change too automatically.
	
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));
	    System.out.println();
	    
        d1[0] = 100.3;
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));
        System.out.println();
        
        d2[1] = 400.5;
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));
	    System.out.println();
	
        //so if we want to copy we should use copyOf() method.
	    double [] d3 = Arrays.copyOf(d2, d2.length);
	    System.out.println(Arrays.toString(d3));
        System.out.println();
        
	    d2[0] = 5.2;//changing the d2[0] value.. But this time d3 wont change. Because it is not referencing the same object now. Its only a copy of d2 
	    System.out.println(Arrays.toString(d2));
	    System.out.println(Arrays.toString(d3));
	
	    
	    //String: == and .equals
	    //Array: reference equality and copyOf()
	
	}

}
