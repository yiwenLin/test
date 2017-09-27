package meituan;

public class test09 {
       private static int process(String str1,String str2,int len1,int len2) {
		
    	   char[] ch1 = str1.toCharArray();
    	   char[] ch2 = str2.toCharArray();
    	   long res = 0;
    	   for (int i = len1; i <=len2; i++) {
    		   char a = ch1[0];
    		   char b = ch2[0];
    		   res+=(long)Math.pow(26, i-1)*(b-a);
    		   long suma = 0;
    		   long sumb = 0;
    		   for (int j = 1; j < ch1.length; j++) {
				suma = suma+(ch1[j]-'a')*(long)Math.pow(26, i-1-j);
			}
    		   for (int j = 1; j < ch2.length; j++) {
    			   sumb = sumb+(ch2[j]-'a')*(long)Math.pow(26, i-1-j);
				
			}
    		   res = res +sumb - suma;
			
		}
    	   res--;
    	   res=res%1000007;
    	   return (int)res;
    	   
       }
}
