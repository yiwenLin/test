package jd;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()) {
    		int num = sc.nextInt();
    		int sum = 0;
    		for (int i = 2; i <=num-1; i++) {
				sum += hexSum(num,i);
			}
    		int gcd = gcd(sum,num-2);
    		System.out.println(sum/gcd+"/"+(num-2)/gcd);
    	}
    	sc.close();
    }

	public static int gcd(int one, int two) {
		// TODO tAuto-generated method stub
		return two==0?one:gcd(two,one%two) ;
	}

	public static int hexSum(int num, int base) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(num!=0) {
			sum += num%base; 
			num = num/base;
		}
		return sum;
	}
}
