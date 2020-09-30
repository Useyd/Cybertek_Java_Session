package day12_ControlFlowStatements_Part6;

public class LabelStatement {

	public static void main(String[] args) {

		int i = 0;
		
		outer: // -> label
		
			do {
				
				i=8;
				inner:// -> label
					while (true) {
						
						System.out.println(i--);
					
						if(i==4) {
							
							break outer;// -> label
							
						}
					}
			
			}while(true); 
				
			
		
				
	}

}
