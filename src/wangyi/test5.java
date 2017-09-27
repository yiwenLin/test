package wangyi;

import java.util.Scanner;

public class test5 {
	
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		//用一个二维数组存储
		int[][] arr = new int[1][n];
		for(int i = 0;i<n;i++){
			arr[0][i] = sc.nextInt();
		}
		//初始化单元矩阵
		int[][] mul=  new int[n][n];
		for (int i = 0; i < n; i++) {
			if(i<n-1){
				mul[i][i] = 1;
				mul[i][i+1] = 1;
			
		    }else{
		    	mul[i][i]=1;
		    	mul[0][i]=1;
		    	
		    }
	}
		for(;k>0;k>>=1){
			if((k&1)==1){
				arr = Core(arr,mul);
			}
			    mul = Core(arr,mul);
		}
		int i;
		for ( i = 0; i < n-1; i++) {
			System.out.println(arr[0][i]+"");
		}
		System.out.println(arr[0][i]);

}

	private static int[][] Core(int[][] a, int[][] b) {
	
		int rowRes = a.length;
		int colomnRes = b[0].length;
		int columnA = a[0].length;
		int[][] c = new int[rowRes][colomnRes];
		for (int i = 0; i < rowRes; i++) {
			for (int j = 0; j < colomnRes; j++) {
				for (int k = 0; k < columnA; k++) {
					if(a[i][k]==0 || b[k][j]==0){
						continue;
					}
					c[i][j] +=  a[i][k]*b[k][j];
				}
				if(c[i][j]>100){
					c[i][j]%=100;
				}
			}
			
		}
		return c;
	}
}