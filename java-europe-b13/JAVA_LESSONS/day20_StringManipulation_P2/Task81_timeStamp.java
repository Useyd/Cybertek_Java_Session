package day20_StringManipulation_P2;

public class Task81_timeStamp {

	public static void main(String[] args) {
//Write a method that accepts the date with the time and create a timeStamp for your automation 
//report.
//    String date = "10/10/2019 14:59:00";
//    timeStamp(date); //10102019145900
		
		timeStamp("10/10/2020 14:59:00");		

		
	}

	
	public static void timeStamp(String date) {
		
		
		String timestamp = date.replace("/","").replace(" ", "").replace(":", "");
		System.out.println(timestamp);
		
	}
	
	
	
	
}
