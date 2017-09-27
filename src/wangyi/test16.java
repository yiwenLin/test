package wangyi;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
       long[] num = new long[input+1];
       num[1] = 3;
       num[2] = 9;
       for (int i = 3; i <= input; i++) {
		num[i] = 2*num[i-1] +num[i-2];
		
	}
       System.out.println(num[input]);
	}

}
