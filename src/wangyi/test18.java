package wangyi;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		long sum = 0;
		for (long i = num; i >0; i=1/2) {
			long temp = (i+1)/2;
			sum+=temp*temp;
		}
       System.out.println(sum);
	}

}
