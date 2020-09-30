package day27_Arrays_Part4;

public class ANOTHERSyntaxForColumn {

	public static void main(String[] args) {
		
		int[][] array = new int[4][];//we know the row number but columns not assigned yet.
		
		//we'll assign different column numbers to each rows:
		array[0] = new int[3]; //Row 0 has 3 columns
		array[1] = new int[4]; //Row 1 has 4 columns
		array[2] = new int[5]; //Row 2 has 5 columns
		array[3] = new int[6]; //Row 3 has 6 columns

        //That assign column after syntax is doing the same job as below:
		int[][] array2 = { {0,0,0},{0,0,0,0},{0,0,0,0,0},{0,0,0,0,0,0} };
	}

}
