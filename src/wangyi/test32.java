package wangyi;

import java.util.Scanner;

public class test32 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int l = sc.nextInt();
	   int[] vl = new int[n];
	   vl[0] = 1;
	   int temp;
	   int res = 1;
	   for (int i = 0; i < n-1; i++) {
		   temp = sc.nextInt();
		   vl[i+1] = vl[temp]+1;
		   if(vl[i+1]>res) {
			   res = vl[i+1];
		   }
		
	}
	   if(res<l+1) {
		   int res_temp = res + (l-res+1)/2;
		   if(res_temp>n) {
			System.out.println(n);   
		   }else {
			  System.out.println(res +(l-res+1)/2); 
		   }
	   }else {
		   System.out.println(l+1);
	   }
   }
}
