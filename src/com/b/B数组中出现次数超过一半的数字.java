package com.b;

public class B�����г��ִ�������һ������� {
	/*
	 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
	 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
	 */

	/*
	 * 
	 * ������ع��ص�˼�룺 ��һ��������Ϊ��һ��ʿ��������أ�count = 1�� ������ͬԪ�أ�count++;
	 * ��������ͬԪ�أ���Ϊ���ˣ�ͬ���ھ�,count--��������countΪ0������������µ�iֵ��Ϊ����ص�ʿ����������ȥ���������������ϵ�ʿ����
	 * �п�������Ԫ�ء� �ټ�һ��ѭ������¼���ʿ���ĸ������Ƿ��������һ�㼴�ɡ�
	 */
	public int MoreThanHalfNum_Solution(int[] array) {
		if(array.length==0)
			return 0;
		int flag=array[0];
		int count=1;
		for(int i=1;i<array.length;i++){
			count=array[i]== flag ? count+1 :count-1;
			if(count==0){
				flag=array[i];
				count=1;
			}
		}
		count=0;
		for(int i=0;i<array.length;i++)
			if(array[i]==flag)
				count++;
		return count>array.length/2 ? flag : 0;
	}
	

}
