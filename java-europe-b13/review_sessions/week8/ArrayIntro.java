package week8;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//declare int array with size 4
		int[] nums = new int[4];
		
		//assign values to each index
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 700;
		//nums[4] = -5;
 
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		
		int x = nums[3];
		
		//we can use int variable2s for index
		
		int i=0;
		System.out.println(nums[i]);
	
		i++;
		System.out.println(nums[i]);
	
		System.out.println(nums.length);
	
		//for iterator loop
		for (int j=0; j<nums.length; j++) {
			
			System.out.println(nums[j]);
		}
	
		//modify index to 222
		
		nums[0]=222;
		
		System.out.println("number at index 0: " + nums[0]);
		
		//read value from index 1 and store into index 2
	
	
	
	}

}
