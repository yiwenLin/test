package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int[] arr = new int[num];
         for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
         Arrays.sort(arr);
         //需要定义一个boolean 来标记是否成功
         boolean flag = true;
         int d = arr[1] - arr[0];
         for (int i = 2; i < arr.length; i++) {
			if(arr[i] - arr[i-1]!=d) {
				flag = false;
			}
		}
         if(flag) {
        System.out.println("Possible");
         }else {
        	 System.out.println("Impossible");
         }
	}

}
