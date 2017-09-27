package meituan;

import java.util.Scanner;

public class test03 {
    public static int getMaxArea(int[]height) {
    	int len = height.length;
    	int max = 0;
    	for (int i = 0; i < len; i++) {
			int minHeight = height[i];
			for (int j = i+1; j < len; j++) {
				minHeight = Math.min(minHeight, height[i]);
				max= Math.max(max, (j-i+1)*minHeight);
			}
		}
		return max;
    	
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(getMaxArea(arr));

	}

}
