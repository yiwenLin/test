package meituan;

public class test08 {
           public int countArea(int[]A,int n) {
        	   int maxArea = 0;
        	   int min;
        	   for (int i = 0; i < n; i++) {
				min = Integer.MAX_VALUE;
				for (int j = i; j >=0; j--) {
					min = Math.min(min, A[j]);
					maxArea = Math.max(maxArea, (i-j+1)*min);
				}
			}
			return maxArea;
           }
}
