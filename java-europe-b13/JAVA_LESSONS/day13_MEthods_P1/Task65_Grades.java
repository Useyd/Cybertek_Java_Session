package day13_MEthods_P1;

public class Task65_Grades {

	public static void main(String[] args) {


		calculateGrade(55,100,0);
		
		
		
	}

	public static void calculateGrade(int i, int j, int k) {

		double average = (i+j+k)/3;
		
		
		if(average>=90 && average<=100) {
			
			System.out.println("Your grade is A");
			
		}else if(average>=80 && average<=89) {
			
			System.out.println("Your grade is B");
		
		}else if(average>=70 && average<=79) {
			
			System.out.println("Your grade is C");
		}else if(average>=60 && average<=69) {
			
			System.out.println("Your grade is D");
		}else if(average>=0 && average<=59) {
			
			System.out.println("Your grade is F");
		}else {
			
			System.out.println("Invalid Value! Exam results should be between 0-100");
		}
		
		
		
			
		
		
	}

}
