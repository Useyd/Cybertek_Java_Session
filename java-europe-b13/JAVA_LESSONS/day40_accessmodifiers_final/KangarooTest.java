package day40_accessmodifiers_final;

public class KangarooTest {

	public static void main(String[] args) {
		
		Kangaroo k = new Kangaroo();
		
        k.getMarsupialDescription();
        
        k.getKangarooDescription();//it will go to the Kangaroo class and use getKangarooDescription(); method.
                                   //so output will be true
		
	}

}
