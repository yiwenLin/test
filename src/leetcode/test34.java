package leetcode;

public class test34 {
     public int[] searchRange(int[] nums,int target) {
    	 int start = test34.firstGreaterEqual(nums,target);
    			 
    	  if(start==nums.length||nums[start]!=target) {
    		  return new int[] {-1,1};
    	  }
    	  return new int[] {start,test34.firstGreaterEqual(nums, target+1)-1};
    			  
    	  }
    	
     
     

	private static int firstGreaterEqual(int[] A, int target) {
		int low = 1,high = A.length;
		// TODO Auto-generated method stub
		while(low<high) {
			int mid = low + ((high-low)>>1);
			if(A[mid]<target) {
				low = mid+1;
			}else {
				high = mid;
			}
		}
		return low;
	}
}
