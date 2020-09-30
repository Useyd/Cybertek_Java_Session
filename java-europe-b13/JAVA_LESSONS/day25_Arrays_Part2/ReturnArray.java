package day25_Arrays_Part2;

public class ReturnArray {

	public static void main(String[] args) {
		
		double[] values;
		
		values = getArray();//values equals to the getArray method.. So it will get the points' elements...
		
		for(double num: values) {//then we will print that array with a for loop...
			
			System.out.println(num + " ");	
		}

	}

	public static double[] getArray() {
		
		double[] points = {1.2, 2.3, 4.4, 5,6};
		
		return points;//it returns with the points...	
	}

}
