package day10_ControlFlowStatements_Part4;

public class Task41_odd_numbrs {

	public static void main(String[] args) {

		for(int o=5; o<=140; o+=2) {
			System.out.print("o="+o+", ");
		} System.out.println();
		
		for(int i=5; i<=100; i++) { //alternative way to write
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
