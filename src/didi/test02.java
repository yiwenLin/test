package didi;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	int[] desk = new int[n];
        	for (int i = 0; i < n; i++) {
				desk[i] = sc.nextInt();
			}
        	Arrays.sort(desk);
        	PriorityQueue<Customer> queue = new PriorityQueue<>();
        	for (int i = 0; i < m; i++) 
        	{ int b = sc.nextInt();
        	  int c = sc.nextInt();
        	 
        	if(b<=desk[n-1])queue.add(new Customer(b,c));
        	 
        	}
        	boolean[] visited = new boolean[n];
        	  long sum = 0;
        	  long count = 0;
        	  while(!queue.isEmpty()) {
        		  Customer customer = queue.poll();
        		  for (int i = 0; i < n; i++) {
					if(customer.peopleCount<=desk[i]&&!visited[i]) {
						sum+=customer.moneyCount;
					    visited[i] = true;
					    count++;
					    break;
				}
        	  }
				if(count==n)break;
				
        	  }	
        	  System.out.println(sum);
        }
        
       
	}
	static class Customer implements Comparable<Customer>{
        private int peopleCount;
        private int moneyCount;
		
		public Customer(int peopleCount, int moneyCount) {
			this.peopleCount = peopleCount;
			this.moneyCount = moneyCount;
			
		}
		
		public int compareTo(Customer o) {
			// TODO Auto-generated method stub
			if(o.moneyCount>this.moneyCount) return 1;
			else if(o.moneyCount<this.moneyCount)return -1;
			return 0;
		}
		
	}

}
