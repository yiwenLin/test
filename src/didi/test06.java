package didi;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n = sc.nextInt();
        	int sum = sc.nextInt();
        	int[] a = new int[n];
        	for (int i = 0; i <n; i++) 
        		a[i] = sc.nextInt();
        		long[][] dp = new long[n+1][sum+1];
        		for (int j = 0; j < sum+1; j++) 
        			dp[0][j] = (long)0;
        		for (int i = 0; i < n+1; i++) 
        			dp[i][0] = (long)1;
        		for (int i = 0; i < n+1; i++) {
        			for (int j = 0; j < sum+1; j++) {
						if(j>=a[i-1]) dp[i][j] = dp[i-1][j]+dp[i-1][j-a[i-1]];
						else dp[i][j] = dp[i-1][j];
					}
					
				}
        		System.out.println(dp[n][sum]);
        }
        sc.close();
	}

}
