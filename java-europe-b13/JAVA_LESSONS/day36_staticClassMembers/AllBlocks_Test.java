package day36_staticClassMembers;

public class AllBlocks_Test {

	public static void main(String[] args) {
		
		//Runs static blocks first, one time
		
		//Runs all instance blocks before the object
		AllBlocks o1 = new AllBlocks();
		
		//Runs all instance blocks before the object again
		AllBlocks o2 = new AllBlocks(8);

	}

}
