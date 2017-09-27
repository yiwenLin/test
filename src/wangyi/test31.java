package wangyi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        int count = 1;
        char[] charS = s.toCharArray();
        char c = charS[0];
        for (int i = 0; i < charS.length; i++) {
			if(c!=charS[i]) {
				c = charS[i];
				count++;
			}
		}
        DecimalFormat df = new DecimalFormat("#¡£00");
        System.out.println(df.format((double)Math.round(((double)charS.length)/((double)count)*100)/100));
	}

}
