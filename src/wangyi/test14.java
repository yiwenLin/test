package wangyi;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
    	  int n = sc.nextInt();
    	  System.out.println(count(n));
      }
	}

	private static int count(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		double r = Math.sqrt(n);
		for (int i = 0; i < r; i++) {
			double j  = Math.sqrt(n-i*i);
			if(Math.abs(j-Math.round(j))<=0.000000001) {
				count++;
			}
		}
		return 4*count;
	}

}
