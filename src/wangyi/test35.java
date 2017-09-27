package wangyi;

import java.util.Scanner;

public class test35 {
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] a = new int[n];
	  for (int i = 0; i < n; i++) a[i] = sc.nextInt();
	  int[][] dp = new int[n+1][n+1];
	  for (int i = n-1; i >=0; i--) {
		  for (int j = n-1; j >=0; j--) {
				int next = Math.max(i, j)+1;
				dp[i][j] = Integer.MAX_VALUE;
				dp[i][j] = Math.min(dp[i][j], dp[next][j]+(i==0?0:Math.abs(a[next-1]-a[i-1])));
				dp[i][j] = Math.min(dp[i][j], dp[i][next]+(j==0?0:Math.abs(a[next-1]-a[j-1])));
 			}
	}
	  System.out.println(dp[0][0]);
  }
}
