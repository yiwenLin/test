package tencent;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class tencent03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new  Scanner(System.in);
    while(sc.hasNext()) {
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
    	Arrays.sort(a);
    	if(a[0]==a[n-1]) {
    		int temp = (n*(n-1))/2;
    		System.out.print(temp+""+temp);
    		continue;
    	}
    	Map<Integer,Integer> map= new TreeMap<Integer,Integer>();
    	for (int i = 0; i < n; i++) {
    		if(map.containsKey(a[i])) 
    			map.put(a[i], map.get(a[i])+1);
    			
    		
    		else
    			map.put(a[i], 1);
		}
    	int minres = 0;
    	if(map.size()==n) {
    		int min = Math.abs(a[1]-a[0]);
    		for (int i = 2; i < n; i++) {
				int temp = Math.abs(a[i]-a[i-1]);
				if(temp==min) 
					minres++;
				else if(temp<min) {
					min = temp;
					minres =1;
				}
			    }
				}else {
    	       
			   for(Integer key : map.keySet()) {
				int var = map.get(key);
				if(var>1) {
					minres += var*(var-1)/2;
				}
			}
    	}
    	int maxres = 0;
    	List<Integer> keyset = new ArrayList<Integer>(map.keySet());
    	int val1 = map.get(keyset.get(0));
    	int val2 = map.get(keyset.get(keyset.size()-1));
    	maxres = val1*val2;
    	System.out.println(maxres+""+minres);
    }
    
	}

}
