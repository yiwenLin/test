package wangyi;

import java.util.Scanner;

public class test33 {
      public static void main(String[]args) {
    	  Scanner sc = new Scanner(System.in);
    	  int m = sc.nextInt();
    	  while(m-->0) {
    		  int n = sc.nextInt();
    		  int[] a = new int[n];
    		  for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    		  int cnt4 = 0 ,cnt2 = 0,  cnt0 = 0;
    		  for (int i : a) {
				if(i%4==0) cnt4++;
				else if(i%2==0)cnt2++;
				else cnt0++;
				if(cnt4>cnt0) {
					System.out.println("No");
					continue;
				}
				System.out.println("Yes");
			}
    	  }
      }
}
