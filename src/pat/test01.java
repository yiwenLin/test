package pat;

import java.math.BigInteger;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for (int i = 0; i < t; i++) {
    	   BigInteger a = sc.nextBigInteger();
    	   BigInteger b = sc.nextBigInteger();
    	   BigInteger c = sc.nextBigInteger();
    	   BigInteger sum = a.add(b);
    	   if(sum.compareTo(c)>0)
    		   System.out.println("Case #"+i+":true");
    	   else
    		   System.out.println("Case #"+i+":false");
		
	}
	}

}
