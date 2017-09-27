package wangyi;

import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
	 //输入数据
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] tx = new int[n];
	 int[] ty = new int[n];
	 for(int i = 0;i<tx.length;i++){
		 tx[i]= sc.nextInt();
	 }
	 for(int j = 0;j<ty.length;j++){
		 tx[j]= sc.nextInt();
	 }
	 
	 int[] g =new int[2];
	 for(int i = 0;i<g.length;i++){
		 g[i] = sc.nextInt();
	 }
	 int walktime = sc.nextInt();
	 int drivetime = sc.nextInt();
	 if(tx.length!=ty.length){
		 return;
	 }
	 
	 //到公司的第一中选择
	 double[] a =new double[tx.length];
	 double[] t = new double[tx.length];
	 for(int i = 0;i<tx.length;i++){
		 a[i] = Math.abs(tx[i]-0)+Math.abs(ty[i]-0);
		 a[i] =a[i]*walktime;
		 t[i]= Math.abs(tx[i]-g[0])+Math.abs(ty[i]-g[1]);
		 t[i]= a[i]+t[i]*drivetime;
		 
	 }
	 Arrays.sort(t);
	 
	 //到公司的第二种选择
	 double[] t2 = new double[tx.length];
	 for(int i =0;i<tx.length;i++){
		 t2[i] = Math.abs(g[0]) + Math.abs(g[1]);
		 t2[i]= t2[i]*walktime;
		 
	 }
	 Arrays.sort(t2);
	
	if(t2[0]<t[0]){
		System.out.println((int)t2[0]);
	}else{
		System.out.println((int)t[0]);
	}
	}
	
}