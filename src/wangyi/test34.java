package wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test34 {
	
	private static Set<String> set = new HashSet<String>();
	
    static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       getSequence(str);
       System.out.println(set.size()-1);
       sc.close();
       
	}
	private static void getSequence(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			char c = str.charAt(i);
			sb.deleteCharAt(i);
			for (int j = 0; j < str.length(); j++) {
			sb.insert(j, c)	;
			if(isLegal(sb.toString())) {
		      set.add(sb.toString());
			}
			sb.deleteCharAt(j);
			}
		}
	}
	private static boolean isLegal(String s) {
		// TODO Auto-generated method stub
		int left = s.length()/2, right = s.length()/2;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') 
				left--;
			else
				right--;
			if(right<left)
				return false;
		}
		
		return true;
	}

}
