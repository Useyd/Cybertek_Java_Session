package day16_ClassObjects;

public class EmployeeClass {

	public static void main(String[] args) {


		
		Employee_ClassTask emp1 = new Employee_ClassTask();
		emp1.name = "John";
		emp1.jobTitle = "Product Owner";
		emp1.salary = 10_000.0;
		
		emp1.work();
		emp1.attendMeeting();
		emp1.introduce();

		
	}

}
