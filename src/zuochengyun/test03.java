package zuochengyun;

import java.util.Arrays;

public class test03 {
    public static boolean checkSum(String stringA,String stringB) {
    	char[] c1 = stringA.toCharArray();
    	char[] c2 = stringB.toCharArray();
    	Arrays.sort(c1);
    	Arrays.sort(c2);
		return Arrays.equals(c1, c2);
    	
    }
}
