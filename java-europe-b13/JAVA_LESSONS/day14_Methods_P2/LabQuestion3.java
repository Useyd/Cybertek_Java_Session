package day14_Methods_P2;

public class LabQuestion3 {

	public static void main(String[] args) {

		specialEleven(122);
        specialEleven(23);
        specialEleven(25);
        specialEleven(78);
        specialEleven(121);
	}

	public static void specialEleven(int i) {

		if(i%11==0 || (i-1)%11==0) {
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		
	}

}
