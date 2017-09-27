package wangyi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
    	  int n = sc.nextInt();
    	  int[] x = new int[n];
    	  int[] y = new int[n];
    	  for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
    	  for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}
    	  List<Long> res = new ArrayList<>();
    	  long min, sum;
    	  for (int i = 1; i <= n; i++) {
			min = Long.MAX_VALUE;
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					sum = 0;
					PriorityQueue<Integer> pq = new PriorityQueue<>(i,new Comparator<Integer>() {

						@Override
						public int compare(Integer o1, Integer o2) {
							// TODO Auto-generated method stub
							return o2 - o1;
						}
						
					});
					for (int c = 0; c < n; c++) {
						int xc = x[c];
						int yc = y[c];
						int distance = Math.abs(xc-x[row]) + Math.abs(yc-y[col]);
						sum +=distance;
						pq.add(distance);
						if(pq.size()>i) {
							sum -= pq.poll();
						}
					}
					min = Math.min(min, sum);
				}
			}
			res.add(min);
		}
    	  for (int i = 0; i < n-1; i++) System.out.println(res.get(i)+"");
    	  System.out.println(res.get(n-1));
      }
	}

}
