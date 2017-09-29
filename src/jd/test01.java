package jd;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt();
        	boolean[][] bp = new boolean[n][n];
        	int res = n;
        	for (int gap = 2; gap < n-1; gap++) 
        		for (int j = 0; j <n; j++) {
					if(!bp[j][(j+gap)%n]&&!bp[(j+gap)%n][j]) {
						int k = gap -1;
						boolean b = true;
						while(k>0) {
							if(!(arr[(j+k)%n]<=arr[(j+gap)%n]&&arr[(j+k)%n]<=arr[j])) 
								b = false;
							    k--;
							
						}
						if(b) {
							bp[j][(j+gap)%n] = true;
							bp[(j+gap)%n][j] = true;
							res++;
						}
					}
				}
				System.out.println(res);
			
			
		
	}

}
