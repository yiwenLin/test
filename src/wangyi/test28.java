package wangyi;

import java.util.Scanner;

public class test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] f = new int[n][k+1];
        int s[] = new int [n];
        s[0] = k;
        for (int i = 1; i < k; i++) 
			f[0][i] = 1;
		for (int i = 1; i <n; i++) 
			for (int j = 1; j < k; j++) {
				f[i][j] = s[i-1];
				int now = 2*j;
				while(now<=k) {
					f[i][j]=(f[i][j]-f[i-1][now]+1000000007)%1000000007;
					now+=j;
				}
				s[i] = (s[i]+f[i][j])%1000000007;
			}
			System.out.println(s[n-1]);
	}

}
