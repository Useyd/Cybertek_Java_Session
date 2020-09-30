package day33_ClassObjects_Constructors;

public class Task_Student {
	
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek University"; // All students studying in Cybertek University. So we can make it default.
	
	
	public Task_Student(String name, int age, char gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attendLecture() {
		
		System.out.println(name + " is attending lecture");
	}
	
	public void submitAssignment() {
		
		System.out.println(name + " is submitting assignment");
	}
	
	public void attendLab() {
		
		System.out.println(name + " is attending lab");
	}
	
	public void university() {
		
		System.out.println(name + " studies at " + university);
	}
	
}
