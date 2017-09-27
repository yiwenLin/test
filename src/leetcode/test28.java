package leetcode;

public class test28 {
       public int strStr(String hayStack,String needle) {
    	   for (int i = 0; ; i++) {
			 for (int j = 0; ; j++) {
				if(j==needle.length()) return i;
				if(i+j==hayStack.length()) return-1;
				if(needle.charAt(j)!=hayStack.charAt(i+j))break;
			}
		}
		
    	   
       }
}
