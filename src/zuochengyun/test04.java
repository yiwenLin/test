package zuochengyun;

public class test04 {
       public String replaceSpace(String iniString,int length) {
    	   StringBuilder sb = new StringBuilder();
    	   char[] ch = iniString.toCharArray();
    	   for (int i = 0; i < length; i++) {
			if(ch[i]==' ') {
				sb.append("%20");
				
			}
			else {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
    	   
       }
}
