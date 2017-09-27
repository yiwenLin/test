package didi;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = n; i >=5; i--) {
			int tmp = i;
			while(tmp%5==0) {
				res++;
				tmp/=5;
			}
		}
        System.out.println(res);
	}

}
