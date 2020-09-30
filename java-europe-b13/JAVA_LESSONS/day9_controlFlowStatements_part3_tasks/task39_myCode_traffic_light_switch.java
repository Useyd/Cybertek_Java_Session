package day9_controlFlowStatements_part3_tasks;

public class task39_myCode_traffic_light_switch {

	public static void main(String[] args) {

		String code = "g";
		
		switch (code) {
		
		case "R":
		case "r":
		System.out.println("Red");
		break;
		
		case "O":
		case "o":
		System.out.println("Orange");
		break;
		
		case "G":
		case "g":
		System.out.println("Green");	
		break;
		
		default:
		System.out.println("Invalid Colour");
		
		}
		
	}

}
