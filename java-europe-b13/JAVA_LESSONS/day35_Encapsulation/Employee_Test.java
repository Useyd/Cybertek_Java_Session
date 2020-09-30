package day35_Encapsulation;

public class Employee_Test {

	public static void main(String[] args) {

		Employee_SETTERandGETTER e1 = new Employee_SETTERandGETTER();
		Employee_SETTERandGETTER e2 = new Employee_SETTERandGETTER("Mark", 392119);
		Employee_SETTERandGETTER e3 = new Employee_SETTERandGETTER("Tedd", 817283, "Sales", "Sales Person");
		
		
		//outputs will be reference the constructors.
		//e1 goes to Employee()
		//e2 goes to Employee(String name, int idNumber)
		//e3 goes to Employee(String name, int idNumber, String department, String position)                                                
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
		System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());
		
		//assigning new values to Employee() through e1. 
		e1.setName("Mike");
		e1.setIdNumber(89778);
		e1.setDepartment("Accounting");
		e1.setPosition("VP");
		//now it will give no blanks. Every method will return some values.
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		
		//it will call all methods in one time
		System.out.println(e1.toString());
	}

}
