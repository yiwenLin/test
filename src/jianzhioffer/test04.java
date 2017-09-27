package jianzhioffer;

import java.util.HashMap;

public class test04 {
       public TreeNode reConstructBinaryTree(int[]pre,int[]in) {
    	   if(pre==null||in==null) {
    		   return null; 
    	   }
    	   HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	   for (int i = 0; i < in.length; i++) {
			map.put(in[i], i);
		}
		return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
    		   
       }

	public TreeNode preIn(int[] p, int pi, int pj, int[] n, int ni, int nj, HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		if(pi<pj) {
			return null;
		}
		TreeNode head = new TreeNode(p[pi]);
		int index = map.get(p[pi]);
		head.left = preIn(p,pi+1,pi+index-ni,n,ni,index-1,map);
		head.right = preIn(p,pi+index-ni,pj,n,index+1,nj,map);
		return head;
	}

}
