package com.a;

public class I��̬��̨�� {
	/*
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
	 */
	public int JumpFloorII(int target) {
		if(target<=2)
			return target;
		int sum=2;
		while(--target>1){
			sum=sum*2;
		}
		return sum;
	}

}
