package day24_Arrays_Part1;

public class AverageWithArray_Forlooped {

	public static void main(String[] args) {
		
	int[] scores = {12,2535,36,323,36,65,65,364,324,256,25,12,188,23,47,558,85};
	
	int sum=0;
	
	for (int i=0; i<scores.length; i++) {
	
	sum+=scores[i];
	
	}
	
	double average = sum/scores.length;

	System.out.println("Sum of the elements is: " + sum);
	System.out.println("Total element number in array is: " + scores.length);
	System.out.println("Average is: " + average);
	}

}
