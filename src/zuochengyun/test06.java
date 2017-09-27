package zuochengyun;

public class test06 {
    public int[][] transformImage(int[][]mat,int n){
    	for (int i = 0; i < n>>1; i++) {
			for (int j = i; j < n-1-i; j++) {
				int k = mat[i][j];
				mat[i][j] = mat[n-1-j][i];
				mat[n-1-j][i] = mat[n-1-i][n-1-j];
				mat[n-i-i][n-1-j] = mat[j][n-1-i];
				mat[j][n-1-i] = k;
				
			}
		}
    	return mat;
    }
}
