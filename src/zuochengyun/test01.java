package zuochengyun;

public class test01 {

	public boolean checkDifferent(String iniString) {
		
		boolean[] charSet = new boolean[65536];
		for (int i = 0; i < iniString.length(); i++) {
			int value = iniString.charAt(i);
			if(charSet[value]) {
				return false;
				
			}
			charSet[value]= true;
		}
		return true;
		
	}
}
