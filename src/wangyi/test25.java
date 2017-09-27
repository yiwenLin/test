package wangyi;

import java.util.Scanner;



public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long  payday  =  sc.nextInt();
        long fruitnum = sc.nextInt();
        long totalmoney = sc.nextInt();
        long fruitprice = sc.nextInt();
        long res = totalmoney/payday;
        res=Math.min(res,(totalmoney+fruitprice*fruitnum)/(payday+fruitprice));
        System.out.println(res);
	}

}
