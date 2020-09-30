package day40_accessmodifiers_final;

public class FinalVariables {

	
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL3_MAX_SPEED;
	public final int MODELX_PASSENGERS;
	public static final String ADMIN_USERNAME; //code block must be static otherwise error.
	
	public FinalVariables() {
		
		MODEL3_MAX_SPEED = 200;
		 //ADMIN_USERNAME = "Useyd"; -> can't write here
	}
			
	{
		
		MODELX_PASSENGERS = 7;
	}
	
	static { // static code block
		
		ADMIN_USERNAME = "Useyd";
	}
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT = 5;
		final int SSN;
		
		SSN = 66;
		//SSN++; -> can't do this. because SSN has final value 66. Can't be modified.
		
		FinalVariables fv = new FinalVariables();
		System.out.println(fv.ROADSTER_MAX_RANGE);
		System.out.println(fv.MODEL3_MAX_SPEED);
		System.out.println(ADMIN_USERNAME);
		

	}

}
