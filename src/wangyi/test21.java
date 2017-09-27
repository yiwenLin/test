package wangyi;

import java.util.HashSet;
import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      HashSet<String> hs = new HashSet<>(); 
      for (int i = 0; i < str.length(); i++) {
		hs.add(str.substring(i, i+1));
		if(hs.size()>2) {
			System.out.println(0);
			return;
		}
	}
      System.out.println(hs.size());
	}

}
