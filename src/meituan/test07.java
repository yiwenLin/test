package meituan;

public class test07 {
      public int countPath(int[][]map,int n, int m) {
    	  int x1 = -1, y1 = -1;
    	  int x2 = -1, y2 = -1;
    	  for (int i = 0; i < n; i++) {
    		  for (int j = 0; j < m; j++) {
				if(map[i][j] ==1) {
					x1 = i;
					y1 = j;
				}else if(map[i][j]==2) {
					x2 = i;
					y2 = j;
				}
			}
			
		}
    	  int xto = x1>x2?-1:1;
    	  int yto = y1>y2?-1:1;
    	  for (int y = y1; y!= (y2+yto);y+=yto) {
    		  for (int x = x1; x!=(x2+xto); x+=xto) {
    			  if(y==y1||x==x1) {
    				  map[y][x] = 1;
    				  continue;
    			  }
    			  map[y][x] = map[y-yto][x] + map[y][x-xto];
				
			}
			
		}
		return map[y2][x2];
    	  
      }
}
