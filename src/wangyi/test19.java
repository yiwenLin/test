package wangyi;

import java.util.Scanner;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
        	int n = sc.nextInt();
        	System.out.println(count(n));
        }
	}

	public static int count(int n) {
		// TODO Auto-generated method stub
		if(n%2!=0||n==10||n<6) return -1;
		if(n%8==0) return n/8;
		return 1+n/8;
	}

}
