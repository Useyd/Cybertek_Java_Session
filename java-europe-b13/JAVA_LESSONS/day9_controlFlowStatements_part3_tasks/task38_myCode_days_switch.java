package day9_controlFlowStatements_part3_tasks;

public class task38_myCode_days_switch {

	public static void main(String[] args) {
		
		int num = 10;
		String day = "Monday";
		
		
		switch (num) {
		
		case 1:
		day = "Monday";
		break;
		
		case 2:
		day = "Tuesday";
		break;
		
		case 3:
		day = "Wednesday";
		break;
		
		case 4:
		day = "Thursday";
		break;
		
		case 5:
		day = "Friday";
		break;
		
		case 6:
		day = "Saturday";
		break;
		
		case 7:
		day = "Sunday";
		break;
		
		default:
			System.out.println("You idiot!");
		
		
		}
		
		System.out.println(day); // hatayi burada yapmisim..
		//boyle yazarsam default kisminda da alt satirda gun gorunuyor
	}

}
