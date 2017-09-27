package zuochengyun;

import java.util.HashSet;

public class test07 {
       public int[][] clearZero(int[][]mat,int n) {
    	   HashSet x = new HashSet();
    	   HashSet y = new HashSet();
    	   for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++) {
				if(mat[i][j] == 0) {
					x.add(i);
					y.add(j);
					
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(x.contains(i)||y.contains(j))
						mat[i][j] = 0;
				
				}
			}
			return mat;


    	   
       }
}
