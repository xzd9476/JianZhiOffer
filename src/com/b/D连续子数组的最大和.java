package com.b;

public class D��������������� {
	/*
	 * ��������������������,������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,
	 * �������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬
	 * ��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
	 */
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array.length==0)
			return 0;
		int temp=0;
		int max=-2147483648;
		for(int i=0;i<array.length;i++){
			if(temp<=0){
				temp=array[i];
			}else{
				temp+=array[i];
			}
			if(temp>max)
				max=temp;
		}
		return max;
	}

}
