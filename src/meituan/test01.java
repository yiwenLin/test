package meituan;

import java.util.Scanner;

public class test01 {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   int n = sc.nextInt();
    	   sc.close();
    	   System.out.println(f(n));
       }

	private static int f(int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			return 0;
		}else if(n==0){
			return 1;
		}
		return f(n-1)+f(n-2)+f(n-3)+f(n-4)+f(n-5)+f(n-6);
	}
}
