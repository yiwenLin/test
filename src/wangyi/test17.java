package wangyi;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int out = rev(rev(m)+rev(n));
		System.out.println(out);

	}

	private static int rev(int num) {
		// TODO Auto-generated method stub
		int x = 0;
		while(num!=0) {
			x = 10*x + num%10;
			num = num/10;
		}
		return x;
	}

}
