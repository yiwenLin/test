package baidu;

import java.util.Scanner;

public class test {
	public static void main(String[] args){
	    //��������һ��������N��N <= 50��������������N������ʾÿ��ñ�ӵļ۸񣨼۸��������������С�ڵ���1000��
	    Scanner sc = new Scanner(System.in);
	    System.out.println("������һ����");
	    int n = sc.nextInt();
	    int[] p = new int[n];
	    int i = 0;
	    while(sc.hasNext()){
	        for(;i<n;i++){
	            p[i]=sc.nextInt();
	        }
	        System.out.println(help(p));
	        
	    }
	    sc.close();
	        
	}

	public static int help(int[] a) {
		if(a==null||a.length<3)
			return -1;
		int n = a.length;
		bubbleSort(a,n);
		int i = 0;
		int j = 0;
		int res = 0;
		int count =1;
		for(;i<n;i++){
			for(j=i+1;j<n&&i<n;j++){
				if(a[j]!=a[i]){
					count++;
				
				if(count==3){
					res = j;
					return a[res];
				}
				i =j;
			}
		}
	  }
		return -1;
	}

	public static void bubbleSort(int[] a, int n) {
		int i = n-1;
		int j;
		int temp;
		while(i>0){
			for(j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
				}
			}
			i--;
		}
		
	}


}
