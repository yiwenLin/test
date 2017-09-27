package pat;

import java.util.Scanner;

public class test04 {
    public static String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String[] lines = new String[4];
      for (int i = 0; i < 4; i++) 
    	  lines[i] = sc.nextLine();
    	  int len1 = lines[0].length();
    	  int num = 0;
    	 for (int i = 0; i < len1; i++) {
			char c = lines[0].charAt(i);
			if(c==lines[1].charAt(i)) {
				if(num==0&&Character.isLetter(c)) {
					System.out.println(week[c-'A']+"");
					num++;
					continue;
				}
				if(num==1) {
					if(Character.isLetter(c)) {
						System.out.println((c-'A'+10)+".");
						break;
					}
					else if(Character.isDigit(c)) {
						System.out.println("0"+c+":");
						break;
					}
						
				}
			}
		}
		
	int len2 = lines[2].length();
	for (int i = 0; i < len2; i++) {
		char c = lines[2].charAt(i);
		System.out.println(i<10?("0"+i):i);
		break;
	}
	}

}
