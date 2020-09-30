package week2;

public class logical_operators {

	public static void main(String[] args) {

		int score = 70;
		
		boolean res1 = (score>=80) && (score<90);
		//F && ..... => && ignores second one. cause first one is false already
		
		System.out.println(res1);
	    System.out.println(); 
		
		int i = -10;
		boolean res2 = (i>0 && i++<10);//T && F => must check the second one cause first one is true
		System.out.println(i);
		
		boolean res3 = (i>0 & i++<10);//T & (it will evaluate the second part)
		System.out.println(i);
	    System.out.println();
	
		boolean x = true, z=true;
		int y=10;
		x=(y!=10) || (z=false);
		
		System.out.println(x);
		System.out.println(z);
		
	
	
	
	
	}

}
