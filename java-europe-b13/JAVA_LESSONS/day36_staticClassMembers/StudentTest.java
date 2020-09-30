package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike", 30, 1000);
		Student s2 = new Student("Ozzy", 20, 2000);
		Student s3 = new Student("Jamal", 10, 3000);
		
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println();
		
		s1.school="CybertekEU"; //since school is a static variable, when we change it it will effect all class. So other school variables are changed too
		
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
