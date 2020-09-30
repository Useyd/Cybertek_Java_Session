package day33_ClassObjects_Constructors;

public class Task_StudentTest {

	public static void main(String[] args) {
		
		Task_Student s1 = new Task_Student("Mike", 17, 'M', 2016, "Java");

		Task_Student s2 = new Task_Student("Smith", 18, 'M', 2016, "JS");
		
		Task_Student s3 = new Task_Student("Mary", 19, 'F', 2017, "TS");
		
		s1.attendLab();
		s2.attendLecture();
	    s3.submitAssignment();
	
	    s1.university();
	    s3.university();
	    
	}

}
