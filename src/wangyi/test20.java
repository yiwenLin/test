package wangyi;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int A = (n1+n1)/2;
		int B =(n2+n4)/2;
		int C = B - n2;
		if((n1+n3)%2==0&&(n2+n4)%2==0&&(A+B==3)) {
			System.out.println(A+" "+B+" "+C);
		}else {
			System.out.println("NO");
		}

	}

}
