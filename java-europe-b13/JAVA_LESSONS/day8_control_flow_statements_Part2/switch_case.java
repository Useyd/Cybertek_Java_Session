package day8_control_flow_statements_Part2;

public class switch_case {

	public static void main(String[] args) {

		String weather ="Thunderstorm";
		
		switch (weather) {//switch will check for all the conditions. and looks for a match with weather value...
		
		case "Sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
		    break; // with break, first case ends. it's been separated from other cases. it's mandatory.
		case "Hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
		    break;
		case "Windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
		    break;
		case "Snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
		    break;
		default: //like else, if none of the cases match it will choose default one
			     //default can be anywhere. but if it's not in the end we should add break. 
			     //Otherwise it will be mixed with other cases
			System.out.println("Code Java in any other weather");
		}
	}

}
