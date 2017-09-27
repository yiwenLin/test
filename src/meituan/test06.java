package meituan;

public class test06 {
       public int[][] flipChesss(int[][]A,int[][]f){
    	   for (int i = 0; i < 3; i++) {
			  change(A,f[i][0]-1,f[i][1]-1);
		}
		return A;
    	   
       }

	public static void change(int[][] a, int i, int j) {
		// TODO Auto-generated method stub
		if(i-1>=0) {
			a[i-1][j] = a[i-1][j]==1?0:1;
		}
		if(i+1<4) {
			a[i+1][j] = a[i+1][j]==1?0:1;

		}
		if(j-1>=0) {
			a[i][j-1] = a[i][j-1]==1?0:1;
		}
		if(j+1<4) {
			a[i][j+1] = a[i][j+1]==1?0:1;
		}
	}
}
