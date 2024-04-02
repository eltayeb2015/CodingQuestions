package coding;

import java.util.Arrays;

public class FindMultipleMissingNumbers {
	
	public static void main(String args[]) {
		int[] numbers = { 1,2,5,6,8,9 };
		Arrays.sort(numbers);
		int index=0;		
		for (int i = 0; i < 20; i++) {
		    if ( index < numbers.length) {
		    	   if(i != numbers[index])
		               System.out.println(i);
		    	   else
		    		   index++;
		    }
		    else {
		    	 System.out.println(i);
		    }
		}		
		System.out.println("--------------------------");
		int[] nums = { 12, 1,2,4,6,8,12 };
		findMissing(1,10, nums);	
	}

	private static void findMissing(int start, int end, int[] nums) {
		int a=start;
		
		//int i=0;
		
		for(int i=0; i<nums.length; ) {
			if(nums[i]<start || nums[i] > end) {
				System.out.println(nums[i] +" out side the range "+a +"-"+end);
				i++;
			}
			else if(nums[i]==start) {
				start++;
				i++;
			}
			else {
				System.out.println(start);
				start++;
			}
			
		}
		
//		while(exit<end) {
//			exit++;
//		    double sum1 = sumRange(start,exit);
//			
//			double sum2 = sumArr(++i, nums);
//			System.out.printf("----> %.2f \n", sum1-sum2);			
//		}	
		
		
	}

	private static double sumArr(int j, int[] arr) {
		int s=0;
		if(j >= arr.length)
			j=arr.length-1;
		
		for(int i=0; i<=j; i++) {			 
				s+=arr[i];
		}
		return s;
	}

	private static double sumRange(int i, int j) {
		return (Math.abs(j-i)+1)*(i+j)/2;
						
	}
	
}
