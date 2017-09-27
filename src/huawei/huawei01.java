/**
 * 
 */
/**
 * @author Administrator
 *
 */
package huawei;

import java.util.Scanner;

public  class huawei01{
	public static void main(String[] args) {
		int M = 0, N = 0;
		int i;
		int A = 0 , B = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			N = sc.nextInt();
			M= sc.nextInt();
//			System.out.println(N+" "+M);
			int [] score = new int[N];
			for (i = 0; sc.hasNext()&&i<N; i++) {
				score[i] = sc.nextInt();
//				System.out.println(score[i]+"");
			}
			String c = null;
			for (i = 0; sc.hasNext()&&i<M; i++) {
				c = sc.next();
				A = sc.nextInt();
				B = sc.nextInt();
				process(c,A,B,score);
			}
		}
		
	}

	private static void process(String c, int a, int b, int[] score) {
		// TODO Auto-generated method stub
		int begin, end;
		if(c.equals("Q")) {
			end = Math.max(a, b);
			begin = Math.min(a, b)-1;
			int max = score[begin];
			for (int i = begin; i < end; i++) {
				if(max<score[begin] ) {
					max = score[i];
						
					}
				}
			System.out.print(max);
			}else if(c.equals("U")) {
				score[a-1] = b;
			}
			
		}
		
	}
