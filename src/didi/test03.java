package didi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class test03 {
	static int n,m, maxRemainEnergy = 0;
	static int[][] map ;
	static boolean flag = true;
	static String path = "";
	static LinkedList<String> linkedlist = new LinkedList<>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int p = sc.nextInt();
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
			
		}
		runMap(0,0,p);
		if(!flag) 
			System.out.println("Can not escape ");
		else
			System.out.println(path);
        
	}
	public static synchronized void runMap(int x, int y, int energy) {
		if(energy<0||x<0||y<0||x>=n||y>=m||map[x][y]!=1)return;
		else {
			linkedlist.offer("["+x+","+y+"]");
			map[x][y] = 0;
			if(x==0&&y==m-1) {
				if(energy>=maxRemainEnergy) {
					maxRemainEnergy = energy;
					updatePath();
				}
				map[x][y] = 1; linkedlist.removeLast();
				flag = true;return;
			}
			runMap(x,y+1,energy-1);
			runMap(x+1,y,energy);
			runMap(x-1,y,energy-3);
			runMap(x,y-1,energy);
			map[x][y] = 1;linkedlist.removeLast();
		}
		
		
	}
	public static void updatePath() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Iterator<String> it= linkedlist.iterator();
		while(it.hasNext())
			sb.append(it.next()+",");
		if(sb.length()>0)
			sb.deleteCharAt(sb.length()-1);
		path = sb.toString();
		
	}

}
