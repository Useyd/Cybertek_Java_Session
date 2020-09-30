package day9_controlFlowStatements_part3_tasks;

public class OR_Logic_withSwitch {

	public static void main(String[] args) {

		//A or B or C - > pass D or E - > fail
		
		char grade = 'A';
		
		/* switch (grade) {
		case 'A':
			System.out.println("pass");
		    break; 
		case 'B':
			System.out.println("pass");
		    break; 
		case 'C':
			System.out.println("pass");
		    break;
		case 'D':
			System.out.println("fail");
		    break;
		case 'E':
			System.out.println("fail");
		    break; 
		
		} Instead of writing like this we can shortly brief it like below */
		
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("pass");
			break;
		case 'D':
		case 'E':
			System.out.println("fail");
			break;
		
		}
		
	}

}
