package com.b;

public class T��1��2��3��n {
	/*
	 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
	 */
	public int Sum_Solution(int n) {
		int sum=n;
		boolean ans = (n>0) &&((sum=sum+Sum_Solution(n-1))>0);
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("kk");
		boolean ans = (false) && (true);
		System.out.println("jj");
	}

}
