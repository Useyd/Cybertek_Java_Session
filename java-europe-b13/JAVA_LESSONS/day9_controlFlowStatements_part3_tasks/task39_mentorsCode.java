package day9_controlFlowStatements_part3_tasks;

public class task39_mentorsCode {

	public static void main(String[] args) {

		char colour = 'g';
		
		switch (colour) {
		case 'R': case 'r':
			System.out.println("Red Light");
			break;
		case 'O': case 'o':
			System.out.println("Orange Light");
			break;
		case 'G': case 'g':
			System.out.println("Green Light");
			break;
		default:
			System.out.println("Invalid Light");
		
		}
		
	}

}
