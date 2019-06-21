package com.a;

public class K二进制中1的个数 {
	/*
	 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
	 */
	public static int NumberOf1(int n) {
		int num=0;
		while(n!=0){
			if((n&1) == 1)
				num++;
			n=n>>>1;
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(NumberOf1(-2));
	}
}
