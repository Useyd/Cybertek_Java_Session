package day14_Methods_P2;

public class LabQuestion4 {

	public static void main(String[] args) {

//you can do this task with nested-if also....
		deerPlay(45,true);
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);
		
	}

	public static void deerPlay(int temp, boolean isSummer) {

		if(temp>60 && temp<90 && isSummer==false) {
			
			System.out.println(true);
		
		}else if(temp>60 && temp<100 && isSummer==true) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

		
	}

}
