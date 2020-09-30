package day14_Methods_P2;

public class LabQuestion6 {

	public static void main(String[] args) {

		cigarParty(30,false);
		cigarParty(50,false);
		cigarParty(70,true);
	
		System.out.println();
		
		cigarPartyMentorsLogic(30,false);
		cigarPartyMentorsLogic(50,false);
		cigarPartyMentorsLogic(70,true);
		
	
	
	}

	public static void cigarParty(int cigars, boolean weekend) {


		if(cigars>=40 && cigars<=60 && weekend!=true) {
			
			System.out.println(true);
		}else if(cigars<40 && weekend!=true) {
			
			System.out.println(false);
		
		}else if(weekend!=true && cigars>60) {
			System.out.println(false);
			
		}else if(weekend==true && cigars>60) {
		
			System.out.println(true);
		}else {
			
			System.out.println(false);
		}
	}

	
	public static void cigarPartyMentorsLogic(int cigars, boolean inWeekend) {
		
		if(inWeekend) {
			if(cigars>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}else {
			if(cigars>=40 && cigars<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
		
		
		
	}
}
