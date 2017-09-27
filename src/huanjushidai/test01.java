/**
 * 
 */
/**
 * @author Administrator
 *
 */
package huanjushidai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		Map<String,Integer> map = new HashMap<>();
		for (char x : arr) {
			if(map.keySet().contains(String.valueOf(x))) {
				int jj = map.get(String.valueOf(x));
				map.put(String.valueOf(x), jj+1);
			}else {
				map.put(String.valueOf(x), 1);
			}
		}
		map.forEach((String x,Integer y) -> {
			if(y>1) {
				System.out.println(x+""+y);
			}
		});
	}
}
