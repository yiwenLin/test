package meituan;

import java.util.Scanner;

public class test10 {
	public static int Average(int W,double Y, double x ,int N) {
		for (int i = 0; i < N; i++) {
			Y = (Y+1)*(1-x)+21*x;
		}
		return (int)Math.ceil(Y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        do {
        	int W = sc.nextInt();
        	double Y = sc.nextDouble();
        	double x = sc.nextDouble();
        	int N  = sc.nextInt();
        	System.out.println(Average(W,Y,x,N));
        }while(sc.hasNext());
	}

}
