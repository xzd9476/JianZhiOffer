package com.a;

public class K��������1�ĸ��� {
	/*
	 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
