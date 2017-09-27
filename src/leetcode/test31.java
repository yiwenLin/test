package leetcode;

public class test31 {
       public void nextPermutation(int[]nums) {
    	   if(nums.length<=1) {
    		   return;
    	   }
    	   int i  = nums.length-1;
    	   for (; i>=1; i++) {
    		   if(nums[i]>nums[i-1]) {
    			   break;
    		   }
			
		}
    	   if(i!=0) {
    		   swap(nums,i-1);
    	   }
    	  reverse(nums,i);
       }

	private void reverse(int[] nums, int i) {
		// TODO Auto-generated method stub
		for (int j = nums.length-1; j >i; j++) {
			if(nums[j]>nums[i]) {
				int t = nums[j];
				nums[j] = nums[i];
				nums[i] = t;
				break;
			}
		}
	}

	private void swap(int[] nums, int i) {
		// TODO Auto-generated method stub
		int first = i;
		int last = nums.length-1;
		while(first<last) {
			int t = nums[first];
			nums[first] = nums[last];
			nums[last] = t;
			first++;
			last--;
		}
	}
}
