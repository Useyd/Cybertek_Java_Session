package day10_ControlFlowStatements_Part4;

public class Task44_SpeedConverter {

	public static void main(String[] args) {

		System.out.println("KPH             MPH");
		System.out.println("-------------------");
		for (int speed=60; speed<=130; speed+=10) {
			
			
			System.out.println(speed + "\t\t" + (speed*0.6214));
			
			
		}
		
	}

}
