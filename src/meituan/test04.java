package meituan;

import java.util.Scanner;

public class test04 {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   String a = sc.nextLine();
    	   String b = sc.nextLine();
    	   sc.close();
    	   System.out.println(count(a,b));
       }

	private static int count(String a, String b) {
		// TODO Auto-generated method stub
		int[][] dp = new int[a.length()][b.length()];
		int max = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if(a.charAt(i)==b.charAt(j)) {
					dp[i][j] = (i-1<0||j-1<0)?1:dp[i-1][j-1]+1;
					max = max<dp[i][j]?dp[i][j]:max;
				}
			}
		}
		return max;
	}
}
