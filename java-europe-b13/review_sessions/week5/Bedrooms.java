package week5;

public class Bedrooms {

	public static void main(String[] args) {

           //System.out.println(bedroom(7));
		
	int monthlyIncome= 3000;
	int rent = bedroom(3);
	double invoices = invoices(100);
	double net = monthlyIncome - (rent+invoices);
	
	System.out.println(net);
	
	}

	
	
	public static double invoices(int i) {

		

		return bedroom(i)*0.5;
	}



	public static int bedroom(int i) {
      
		int rent = 0;
		
		if(i==1) {
	     
		return 1100;
        
		}else if(i==2){
	     return 1850;
	
        }else if(i==3){
         return 2550;
	
        }
	    return rent;
	}
}
