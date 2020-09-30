package day8_control_flow_statements_Part2;

public class if_else_if_else {

	public static void main(String[] args) {

		//Program to display days
		//1->Monday
		//2->Tuesday
		//3->Wednesday
		//4->Thursday
		//5->Friday
		//6->Saturday
		//7->Sunday
		
		int day=6; // changeable value
		
		if (day==1) {
			
			System.out.println("Monday");
		} else if (day==2) {
			
			System.out.println("Tuesday");
						
		} else if (day==3) {
			
			System.out.println("Wednesday");
		} else if (day==4) {
			
			System.out.println("Thursday");
		} else if (day==5) {
			
			System.out.println("Friday");
		} else if (day==6) {
			
			System.out.println("Saturday");
		} else if (day==7) {
			
			System.out.println("Sunday"); 
		} else {
			System.out.println("Not a valid day"); //This is the condition for if the days are not matched with the number I entered
			                                       //Yani üstteki if ve else if lere hitap eden bir girdi yoksa o girdi için sona bir else ekliyoruz 
				
		}
		
		System.out.println("********************"+"\n");
		
		int age=-8; // age is changeable
		
		if (age<2 || age>18) {
			
			System.out.println("ineligible");
		} else if (age==2) {
			
			System.out.println("toddler");
		} else if (age>=3 && age<=5) {
			
			System.out.println("early childhood");
		} else if (age==6 || age==7) {
			
			System.out.println("young reader");
		} else if (age==8 && age<=10) {
			
			System.out.println("elementary");
		} else if (age==11 || age==12) {
			
			System.out.println("middle");
		} else if (age==13) {
			
			System.out.println("impossible");
		} else if (age>=14 && age <=16) {
			
			System.out.println("high school");
		} else if (age==17 || age==18) {
			
			System.out.println("scholar");
		} else {
			
			System.out.println("not valid age"); //if the conditions over here isn't match, else will be used
			
		}
		System.out.print("********************");
	}

}
