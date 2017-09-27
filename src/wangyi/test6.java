package wangyi;

import java.util.HashSet;
import java.util.Scanner;

public class test6 {
	//利用回溯法求值
	private static int cases = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ables = new String[n];
		for (int i = 0; i < n; i++) {
			ables[i] = sc.nextLine();
			//计算
			backtracing(ables,0,new HashSet<Integer>());
			System.out.println(cases);
			sc.close();
		}
	}
	private static void backtracing(String[] ables, int index, HashSet<Integer> hashSet) {
		 if(index>=ables.length){
			 cases++;
			 return;
		 }
		String able = ables[index];
		for (int i = 0; i < ables.length; i++) {
			int work = able.charAt(i)-'0';
			if(!hashSet.contains(work)){
				hashSet.add(work);
				backtracing(ables, index+1, hashSet);
				hashSet.remove(work);
			}
		}
	}

}
