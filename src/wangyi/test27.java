package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       while(sc.hasNextInt()) {
    	   int n =sc.nextInt();
    	   int[] nums = new int[n];
    	   for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
    	   Arrays.sort(nums);
    	   int min = nums[0];
    	   int max = nums[n-1];
    	   int diff = max - min;
    	   int minIndex = 1;
    	   int maxIndex = n-2;
    	   while(minIndex<maxIndex) {
    		   diff+= max - nums[minIndex];
    		   diff+= nums[maxIndex] - min;
    		   min = nums[minIndex++];
    		   max = nums[maxIndex--];
    	   }
    	   diff += Math.max(nums[maxIndex] - min, max - nums[minIndex]);
    	   System.out.println(diff);
    	  
       }
	}

}
