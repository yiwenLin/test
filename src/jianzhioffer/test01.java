/**
 * 
 */
/**
 * @author Administrator
 *
 */
package jianzhioffer;
public class test01{
	  public boolean find(int[][]array,int target) {
		  int len = array.length-1;
		  int i = 0;
		  while((len>=0)&&(i<array[0].length)) {
			  if(array[len][i]>target) {
				  len--;
			  }else if(array[len][i]<target) {
				  i++;
			  }else {
				  return true;
			  }
			  
		  }
		  return false;
	  }
}