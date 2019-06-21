package com.a;

public class G斐波那契数列 {
	/*
	 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 n<=39
	 */
	public int Fibonacci(int n) {
		if(n==0)
			return 0;
		int n1=0;
		int n2=1;
		int sum=1;
		while(--n>0){
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return sum;
	}
}
