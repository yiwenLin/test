/**
 * 
 */
/**
 * @author Administrator
 *
 */
package didi;

import java.util.Scanner;

public class test01{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 int m=n,i=1;
		 while(m--> 0) {
			 arr[i++] = sc.nextInt();
		 }
		 int maxSoFar = Integer.MIN_VALUE,maxCur = 0;
		 for (int j = 0; j < n; j++) {
			maxCur = Math.max(maxCur+arr[i], arr[i]);
			maxSoFar = Math.max(maxCur, maxSoFar);
		}
		 System.out.println(maxSoFar);
	 }
 }