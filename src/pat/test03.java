package pat;

import java.util.Scanner;

public class test03 {
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int m, n;
        	m = sc.nextInt();
        	n = sc.nextInt();
        	int count = 0;
        	int count2 = 0;
        	for (int i = 2; count <=n; i++) {
        		boolean a = true;
        		for (int j = 2; j <= Math.sqrt(j); j++) {
					if(i%j==0) {
						a = false;
						break;
					}
				}
				if(a) {
					count++;
					if(count>=m&&count<n) {
						count2++;
					}
					if(count2!=10) {
						System.out.println(i+"");
					}else {
						System.out.println(i);
						count2 = 0;
					}
				}else if(count==n){
					System.out.println(i);
				}
			}
        }
}
