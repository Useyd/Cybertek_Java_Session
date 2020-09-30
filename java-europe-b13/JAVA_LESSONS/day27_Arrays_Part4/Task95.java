package day27_Arrays_Part4;

public class Task95 {

	public static void main(String[] args) {
		
		int[][] scores = {
				         {68,75,54,80},//    -Student1
				         {100,64,20,50},//   -Student2
				         {10,35,40,90}//     -Student3
	                     };
        //calculate the avegare score
		int sum=0;
		for(int column=0; column<scores.length; column++) {
			
			sum+=scores[0][column];
		}
		
		System.out.println(sum/scores[0].length);
		
		//calculate the total math scores (68,100,10)
		int sum2=0;
		for(int row=0; row<scores.length; row++) {
			
			sum2+=scores[row][0];
		}
		System.out.println(sum2);
		
		
		
		
		
		
		
	}

}
