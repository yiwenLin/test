package meituan;

public class test05 {
	public int getDis(int[]A,int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1,temp; j <n; j++) {
				temp = A[j] - A[i];
				if(temp>max)
					max = temp;
			}
		}
		return max;
		
	}
	

}
