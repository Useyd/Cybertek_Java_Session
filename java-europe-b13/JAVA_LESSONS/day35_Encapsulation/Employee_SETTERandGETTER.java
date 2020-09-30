package day35_Encapsulation;

public class Employee_SETTERandGETTER {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee_SETTERandGETTER() { //Constructor1
		
		name="";
		idNumber=0;
		department="";
		position="";
	}
	
	public Employee_SETTERandGETTER(String name, int idNumber) { //Constructor2
		
		this.name=name;
		this.idNumber=idNumber;
		this.department="";
		this.position="";
		
		
	}

	public Employee_SETTERandGETTER(String name, int idNumber, String department, String position) { //Constructor3
		
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}

	
	//created getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	//right click -> source -> generate toString
	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position="
				+ position + "]";
	}
	
	
	
}
