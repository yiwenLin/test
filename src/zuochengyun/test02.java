package zuochengyun;

public class test02 {
       public String reverseString(String iniString) {
    	   int len = iniString.length();
    	   if(len<=1||iniString == null)
    		   return iniString;
    	   StringBuffer sb = new StringBuffer();
    	   for (int i = len-1; i >=0; i--) {
			sb.append(iniString.charAt(i));
		}
		return sb.toString();
    	   
       }
}
