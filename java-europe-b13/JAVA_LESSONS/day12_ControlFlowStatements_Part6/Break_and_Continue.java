package day12_ControlFlowStatements_Part6;

public class Break_and_Continue {

	public static void main(String[] args) {

		 for (int i=1; i<=5; i++) {
			 
			 if(i==4){//it loops to 4. in four it will skip stop looping.
				 break;// because of the break...
				 
		
			 }
		 
		 System.out.println(i);
		 
		 }
		System.out.println();
         
		
		for (int i=1; i<=5; i++) { // -> iteration
			 
			 if(i==4){//it loops to 4. in four it will go back to iteration.
				 continue;// because of the continue...
				 
		
			 }
		 
		 System.out.println(i);
		 
		 }
		
	}

}
