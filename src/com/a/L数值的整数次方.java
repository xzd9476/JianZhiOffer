package com.a;

public class L��ֵ�������η� {
	/*
	 * ����һ��double���͵�base��int���͵�����exponent����base��exponent�η���
	 */

	public static double Power(double base, int exponent) {
		double res=1;
		double cur=base;
		while(exponent !=0){
			if((exponent&1)==1)
				res=res*cur;
			cur=cur*cur;
			exponent>>=1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(Power(2, 1));
	}
	
}
