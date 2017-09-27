package pat;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n  = sc.nextInt();
       int a[] = new int[n];
       int b[] = new int[5];
       for (int i = 0; i < b.length; i++) {
		b[i] = 0;
		
	}
       int cnt= 0;
       int cnt2 = 0;
       for (int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
		if(a[i]%10==0) {
			b[i] +=a[i];
			
		}
		if(a[i]%5==1) {
			b[1] += a[i]*Math.pow(-1, cnt);
			cnt++;
		}
		if(a[i]%5==2) {
			b[2]++;
		}
		if(b[i]%5==3) {
			b[3]+=a[i];
			cnt2++;
		}
		if(a[i]%5==4) {
			if(b[4]<a[i]) {
				b[4] = a[i];
			}
		}
	}
       float a3= (float)b[3]/(float)cnt2;
       String string = String.format("%.1f", a3);
       StringBuffer sb = new StringBuffer();
       for (int i = 0; i < b.length; i++) {
    	   if(b[i]==0) {
    		   sb.append("N ");
    	   }else {
    		   if(i==3) {
    			   sb.append(string+"");
    		   }else {
    			   sb.append(b[i]+"");
    		   }
    	   }
		
	}
       System.out.println(sb.toString().trim());
    		   
	}

}
