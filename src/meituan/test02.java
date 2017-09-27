package meituan;

import java.util.Scanner;

public class test02 {
	public static long count(int n) {
		if(n<=0) return 0;
		int[] coins = new int[] {1,5,10,20,50,100};
		long[] dp = new long[n+1];
		dp[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <=n; j++) {
				dp[j] = dp[j] + dp[j-coins[i]];
			}
		}
		return dp[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          while(sc.hasNext()) {
        	  int n = sc.nextInt();
        	  long res = count(n);
        	  System.out.println(res);
          }
	}

}
