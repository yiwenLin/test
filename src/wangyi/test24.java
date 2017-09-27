package wangyi;

import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     while(sc.hasNextInt()) {
    	 int n = sc.nextInt();
    	 int[] nums = new int[n];
    	 for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
    	 for (int i = n-1; i >=0; i-=2) {
			System.out.println(nums[i]+"");
		}
    	 for (int i = n%2; i < n-2; i+=2) {
			System.out.println(nums[i]+"");
		}
    	 System.out.println(nums[n-2]);
     }
     
	}

}
