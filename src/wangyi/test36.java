package wangyi;

import java.util.Scanner;

public class test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x[] = new int[n];
       int y[] = new int[n];
       for (int i = 0; i < n; i++) 
    	   x[i] = sc.nextInt();
       for (int i = 0; i <n; i++) 
    		y[i] = sc.nextInt();
       sc.close();
       int maxShoot = 0;
       if(n<4)
    	   maxShoot = n;
       for (int i = 0; i < n; i++) {
    	   for (int j = 0; j < n; j++) {
			int x1 = x[j] - x[i];
			int y1 = y[j] - y[i];
			for (int k = 0; k < n; k++) {
				if(k==i||k==j) 
					continue;
				int count = 3;
				for (int l = 0; l <n; l++) {
					if(l==i||l==j||l==k)
						continue;
					int x2 = x[l] - x[k];
					int y2 = y[l] -y[k];
					int x3 = x[l] - x[i];
					int y3 = y[l] - y[j];
					if(x1*x2+y1*y2==0||x1*y3==y1*x3)
						count++;
				}
				if(count>maxShoot)
					maxShoot = count;
			}
		}
		
	}
       System.out.println(maxShoot);
	}

}
