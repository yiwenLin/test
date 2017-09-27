package wangyi;

import java.util.Scanner;

public class test29 {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  while(sc.hasNext()) {
    		  int coinCount = sc.nextInt();
    		  StringBuilder sb = new StringBuilder();
    		  while(coinCount>0) {
    			  if(coinCount%2==0) {
    				  coinCount = (coinCount-2)/2;
    				  sb.append(2);
    				  
    			  }else {
    				  coinCount = (coinCount-1)/2;
    				  sb.append(1);
    			  }
    		  }
    		 System.out.println(sb.reverse().toString());
    	  }
      }
}
