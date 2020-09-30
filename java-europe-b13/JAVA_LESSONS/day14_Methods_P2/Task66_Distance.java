package day14_Methods_P2;

public class Task66_Distance {

	public static void main(String[] args) {

		int v1 = distance(145,69);
		
		System.out.println("distance is " + v1);
		
		
		
	}

	public static int distance(int speed, int time) {

		int distance = speed*time;

		return distance;//return is breaking the method.
		                //below the return nothing will work
	}

	
	
	
	
	
	
	
	
	
}
