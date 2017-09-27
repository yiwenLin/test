package tencent;

import java.util.Scanner;

public class tecent02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
    	  String str = sc.nextLine();
    	  System.out.println(getResult(str));
      }
	}

	public static String getResult(String str) {
		// TODO Auto-generated method stub
		return str.replaceAll("[A-Z]", "")+str.replaceAll("[a-z]", "");
	}

}
