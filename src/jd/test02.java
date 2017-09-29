package jd;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       TreeSet<Integer> set = new TreeSet<Integer>();
       while(sc.hasNext()) {
    	   int m = sc.nextInt();
    	   int n = sc.nextInt();
    	   for (int i = 1; i <= m+n; i++) {
    		   set.add(sc.nextInt());
			
		}
    	   Iterator<Integer> it = set.iterator();
    	   while(it.hasNext()) {
    		   System.out.println(it.next());
    		   while(it.hasNext())
    			   System.out.println(" ");
    	   }
       }
	}

}
