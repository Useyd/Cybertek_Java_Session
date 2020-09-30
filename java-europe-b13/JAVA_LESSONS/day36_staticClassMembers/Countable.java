package day36_staticClassMembers;

public class Countable {
   
  //       int instanceCount;  it was instance variable first and it was only belong to object.   
	static int instanceCount;//static variable -> belongs to class
	
	
	public Countable() {
		
		instanceCount++;
		
	}
	
	public int getInstanceCount() {
		
		return instanceCount;
		
	}
	
	
	
}
