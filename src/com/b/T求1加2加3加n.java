package com.b;

public class T求1加2加3加n {
	/*
	 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
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
