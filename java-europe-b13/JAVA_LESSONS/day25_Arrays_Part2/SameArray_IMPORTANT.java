package day25_Arrays_Part2;

public class SameArray_IMPORTANT {

	public static void main(String[] args) {
		
		int [] array1 = {2,4,6,8,10};
		
		int [] array2 = array1;
		

		array1[0] = 200;//assigning array1's index 0. It will also change the array2's index 0 too..
		array2[4] = 1000;//assigning array1's index 4. It will also change the array2's index 4 too..
		
		System.out.println("The contents of array1: ");
		for(int value: array1) {
		System.out.println(value);
		}
		System.out.println();
		
		System.out.println("The contents of an array2: ");
		for(int value: array2) {
		System.out.println(value);
	    }
}

}
