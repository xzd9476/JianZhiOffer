package com.a;

public class J���θ��� {
	/*
	 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ� ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
	 */
	public int RectCover(int target) {
		 if(target<=2)
			 return target;
		 int n1=1;
		 int n2=2;
		 int sum=0;
		 while(--target>1){
			 sum=n1+n2;
			 n1=n2;
			 n2=sum;
		 }
		 return sum;
	}
}
