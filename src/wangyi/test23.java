package wangyi;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String str = sc.next();
        	int maxLen = 1;
        	int len = 1;
        	for (int i = 1; i < str.length(); i++) {
				if(str.charAt(i-1)!=str.charAt(i)) {
					len++;
					if(len>maxLen) {
						maxLen = len;
					}
					}else {
						len = 1;
				}
			}
        	System.out.println(maxLen);
        }
	}

}
