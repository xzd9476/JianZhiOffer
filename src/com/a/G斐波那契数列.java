package com.a;

public class G쳲��������� {
	/*
	 * ����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0���� n<=39
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
