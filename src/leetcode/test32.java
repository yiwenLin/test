package leetcode;

import java.util.Stack;

public class test32 {
     public int longestVaildParentheses(String s) {
    	 Stack<Integer> stack = new Stack<Integer>();
    	 int max = 0;
    	 int left = -1;
    	 for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(')stack.push(i);
			else {
				if(stack.isEmpty()) left = i;
				else {
					stack.pop();
					if(stack.isEmpty()) max = Math.max(max, i-left);
					else max = Math.max(max, i-stack.peek());
				}
			}
		}
		return max;
    	 
     }
}
