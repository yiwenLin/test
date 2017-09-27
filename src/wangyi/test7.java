package wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		float p = 0;
		Set mySet = new HashSet();
		for(float i = w;i<=x;i++){
			for(float j = y;j<=z;j++){
				p = i/j;
				mySet.add(Float.toString(p));
			}
			
		}
		System.out.println(mySet.size());
	}

}
