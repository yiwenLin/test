package wangyi;

import java.util.ArrayList;
import java.util.Scanner;

public class test15 {

	public static int del(int m,int n) {
		// TODO Auto-generated method stub
     int mark[] = new int[n+1];
     for (int i = m+1; i < n; i++) {
		mark[i] = Integer.MAX_VALUE;
	}
     for (int i = m; i < n-1; i++) {
		 if(mark[i]==Integer.MAX_VALUE)continue;
		 ArrayList<Integer> list = allFactor(i);
		 for (int j = 0; j < list.size(); j++) {
			int temp = i+list.get(j);
			int count = mark[i]+1;
			if(temp<=n&&mark[temp]>count ){
				mark[temp] = count;
			}
		}
	}
	return mark[n];
	}

	private static ArrayList<Integer> allFactor(int n) {
		ArrayList  list = new ArrayList();
		for (int j = 2; j < Math.sqrt(n); j++) {
			if(n%j==0) {
				list.add(j); 
				if(j!=n/j)list.add(n/j);
			}
			
		}
		return list;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n =  sc.nextInt();
		int r = del(m,n);
		if(r==Integer.MAX_VALUE)r = -1;
		System.out.println(r);
	}

}
