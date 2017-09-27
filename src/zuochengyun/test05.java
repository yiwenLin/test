package zuochengyun;

public class test05 {
     public String zipString(String iniString) {
    	 int low = 0, high = 0;
    	 int len = iniString.length();
    	 StringBuilder sb = new StringBuilder();
    	 char c = ' ';
    	 int count = 0;
    	 while(low<len) {
    		 high = low;
    		 c = iniString.charAt(low);
    		 while((high<len)&&(iniString.charAt(high)==c)){
    			 high++;
    		 }
    		 count = high - low;
    		 sb.append(c);
    		 sb.append(count);
    		 low = high ;
    		 
    	 }
    	 return (sb.toString().length()<len)?sb.toString():iniString;
    	 
     }
}
