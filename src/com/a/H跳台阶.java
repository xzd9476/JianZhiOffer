package com.a;

public class H��̨�� {
	/*
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
	 * ����һ��n��̨�ף���һ����1��ʣ��n-1�ף���һ����2��ʣ��n-2�׼�
	 * ����ʣ�µ�n-1 n-2�ֱַ���n-1 n-2
	 * �����Ǹ�쳲���������
	 */
	public int JumpFloor(int target) {
		if(target==0)
			return 0;
		if(target==1)
			return 1;
		int n1=1;
		int n2=2;
		int sum=2;
		while(--target>1){
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return sum;
	}

}
