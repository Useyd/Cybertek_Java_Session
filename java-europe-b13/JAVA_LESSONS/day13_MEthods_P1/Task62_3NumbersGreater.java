package day13_MEthods_P1;

public class Task62_3NumbersGreater {

	public static void main(String[] args) {

		//calculateGreatest(5,2,3) --> 5
		
		
		calculateGreatest(5,15,3,"<");
		
		
		
		
		
	}

	
	
	


	public static void calculateGreatest(int i, int j, int k, String greater) {
	
		switch (greater) {
		
		case ">": 
	    if (i>j && i>k) {
	    	System.out.println(i+" is the greatest");
	    }else {
	    	System.out.println("Error");
	    }
		break;	
		
		case "<":
		if(j>i && j>k) {
			System.out.println(j + " is the greatest");
		}else {
			System.out.println("Error");
		}
		break;
		
		case "t":
		if(k>i && k>j) {
			System.out.println(k + " is the greatest");
		} else {
			System.out.println("Error");
		}
		default:
			System.out.println("Invalid Value");
		}
		
		
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

